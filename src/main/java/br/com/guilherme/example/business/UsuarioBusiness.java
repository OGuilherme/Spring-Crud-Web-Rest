package br.com.guilherme.example.business;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.guilherme.example.bean.UsuarioBean;
import br.com.guilherme.example.converter.UsuarioConverter;
import br.com.guilherme.example.dao.UsuarioDao;
import br.com.guilherme.example.entity.UsuarioEntity;
import br.com.guilherme.example.exception.CustomException;

@Service
@Component
public class UsuarioBusiness {

	private static final Logger log = LoggerFactory.getLogger(UsuarioBusiness.class);

	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private UsuarioConverter usuarioConverter;

	public Boolean cadastrar(UsuarioBean bean) throws CustomException {
		try {
			usuarioDao.save(usuarioConverter.convertBeanToEntity(bean));
			return true;
		} catch (Exception e) {
			log.error("Ocorreu um erro ao cadastrar usuário. " + e);
			throw new CustomException("Ocorreu um erro ao cadastrar usuário " + bean.getNome());
		}
	}

	public List<UsuarioBean> consultarTodos() {
		List<UsuarioEntity> entities = usuarioDao.findAll();
		return usuarioConverter.convertEntityToBean(entities);
	}

	public UsuarioBean consultarPorId(Integer id) {
		Optional<UsuarioEntity> entity = usuarioDao.findById(id);
		if (!entity.isPresent()) {

		}
		return usuarioConverter.convertEntityToBean(entity.get());
	}
}

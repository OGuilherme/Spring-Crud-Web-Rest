package br.com.guilherme.example.converter;

import org.springframework.stereotype.Component;

import br.com.guilherme.example.bean.UsuarioBean;
import br.com.guilherme.example.entity.UsuarioEntity;

@Component
public class UsuarioConverter implements GenericConverter<UsuarioEntity, UsuarioBean> {

	@Override
	public UsuarioEntity convertBeanToEntity(UsuarioBean bean) {
		if (bean == null) {
			return null;
		}
		UsuarioEntity entity = new UsuarioEntity();

		entity.setId(bean.getId());
		entity.setNome(bean.getNome());
		entity.setEmail(bean.getEmail());
		entity.setSenha(bean.getSenha());

		return entity;
	}

	@Override
	public UsuarioBean convertEntityToBean(UsuarioEntity entity) {
		if (entity == null) {
			return null;
		}
		UsuarioBean bean = new UsuarioBean();

		bean.setId(entity.getId());
		bean.setNome(entity.getNome());
		bean.setEmail(entity.getEmail());
		bean.setSenha(entity.getSenha());

		return bean;
	}
}
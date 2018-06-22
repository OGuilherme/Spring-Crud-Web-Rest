package br.com.guilherme.example.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.guilherme.example.dao.UsuarioDao;
import br.com.guilherme.example.entity.UsuarioEntity;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDAO;

	@Override
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		Optional<UsuarioEntity> optionalUsuarios = usuarioDAO.findByNome(usuario);

		optionalUsuarios.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
		return optionalUsuarios.map(CustomUserDetails::new).get();
	}
}
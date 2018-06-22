package br.com.guilherme.example.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.guilherme.example.entity.UsuarioEntity;

public class CustomUserDetails extends UsuarioEntity implements UserDetails {

	private static final long serialVersionUID = 1L;

	public CustomUserDetails(final UsuarioEntity usuario) {
		super(usuario);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;//getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
				//.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return getSenha();
	}

	@Override
	public String getUsername() {
		return super.getNome();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
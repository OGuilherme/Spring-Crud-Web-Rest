package br.com.guilherme.example.dao;

import java.util.Optional;

import br.com.guilherme.example.entity.UsuarioEntity;

public interface UsuarioDao extends GenericDAO<UsuarioEntity> {
	Optional<UsuarioEntity> findByNome(String usuario);

	Optional<UsuarioEntity> findById(Integer id);
}

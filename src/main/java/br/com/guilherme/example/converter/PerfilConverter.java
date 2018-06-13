package br.com.guilherme.example.converter;

import org.springframework.stereotype.Component;

import br.com.guilherme.example.bean.PerfilBean;
import br.com.guilherme.example.entity.PerfilEntity;

@Component
public class PerfilConverter implements GenericConverter<PerfilEntity, PerfilBean> {

	@Override
	public PerfilEntity convertBeanToEntity(PerfilBean bean) {
		if (bean == null) {
			return null;
		}
		PerfilEntity entity = new PerfilEntity();

		entity.setId(bean.getId());
		entity.setNome(bean.getNome());

		return entity;
	}

	@Override
	public PerfilBean convertEntityToBean(PerfilEntity entity) {
		if (entity == null) {
			return null;
		}
		PerfilBean bean = new PerfilBean();

		bean.setId(entity.getId());
		bean.setNome(entity.getNome());

		return bean;
	}
}
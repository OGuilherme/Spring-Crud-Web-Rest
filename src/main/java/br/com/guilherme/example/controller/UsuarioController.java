package br.com.guilherme.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.guilherme.example.bean.UsuarioBean;
import br.com.guilherme.example.business.UsuarioBusiness;
import br.com.guilherme.example.exception.CustomException;

@Controller(value = "usuario/")
public class UsuarioController {
	
	@Autowired
	private UsuarioBusiness usuarioBusiness;

	@GetMapping(value = "cadastro")
	public String cadastro() {
		return "/usuario/cadastro";
	}
	
	@PostMapping(value = "cadastro")
	public String cadastro(@ModelAttribute ModelAndView model, UsuarioBean bean) {
		try {	
			usuarioBusiness.cadastrar(bean);
			model.addObject("mensagem", "Usuário: "+bean.getNome()+" cadastrado com sucesso!");
		}catch (CustomException e) {
			model.addObject("mensagemErro", e);
		}
		bean.setSenha(null);
		model.addObject("usuario", bean);
		return "/usuario/cadastro";
	}
	
	@GetMapping(value = "consulta")
	public String consulta(@ModelAttribute ModelAndView model) {
		model.addObject("usuarios", usuarioBusiness.consultarTodos());
		return "/usuario/consulta";
	}
	
	@PostMapping(value = "consulta")
	public String consulta(@ModelAttribute ModelAndView model, UsuarioBean bean) {
		model.addObject("usuarios", usuarioBusiness.consultarPorId(bean.getId()));
		return "/usuario/consulta";
	}
}

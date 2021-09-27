package br.com.alura.carteira.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.dto.LoginFormDto;
import br.com.alura.carteira.dto.TokenDto;
import br.com.alura.carteira.infra.security.AutenticaoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

	@Autowired
	private AutenticaoService service;
	
	@PostMapping
	public TokenDto autenticar(@RequestBody @Valid LoginFormDto dto) {
		return new TokenDto(service.autenticar(dto));
	}

}

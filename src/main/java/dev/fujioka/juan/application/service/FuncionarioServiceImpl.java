package dev.fujioka.juan.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.fujioka.juan.domain.model.funcionario.Funcionario;
import dev.fujioka.juan.domain.service.FuncionarioService;
import dev.fujioka.juan.infrastructure.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl extends BaseServiceImpl<Funcionario> implements FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	@Override
	public FuncionarioRepository getRepository() {
		return repository;
	}

	
}

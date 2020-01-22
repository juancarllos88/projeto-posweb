package dev.fujioka.juan.presentation.dto.empresa;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaRequestTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String razaoSocial;
	private String cnpj;

}

package br.com.serratec.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.serratec.api.repository.PedidoRepository;
import br.com.serratec.api.repository.UsuarioRepository;

public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ListaDeDesejosRepository listaDeDesejosRepository;
}

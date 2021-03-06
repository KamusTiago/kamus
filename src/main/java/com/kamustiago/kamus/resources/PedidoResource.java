package com.kamustiago.kamus.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kamustiago.kamus.domain.Pedido;
import com.kamustiago.kamus.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	// Instanciei
	@Autowired
	public PedidoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok(obj);

	}

}

package br.com.alura.microservice.transportador.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.transportador.transport.EntregaDTO;
import br.com.alura.microservice.transportador.transport.VoucherDTO;
import br.com.alura.microservice.transportador.service.EntregaService;

@RestController
@RequestMapping("/entrega")
public class EntregaResource {
	
	@Autowired
	private EntregaService entregaService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody EntregaDTO pedidoDTO) {
		return entregaService.reservaEntrega(pedidoDTO);
	}
}

package br.com.alura.microservice.transportador.transport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VoucherDTO {

	private Long numero;
	
	private LocalDate previsaoParaEntrega;
}

package br.com.alura.microservice.transportador.repositories;

import br.com.alura.microservice.transportador.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {

}

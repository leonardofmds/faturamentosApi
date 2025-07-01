package br.com.cotiinformatica.repositories;

import br.com.cotiinformatica.entities.Faturamento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FaturamentoRepository extends MongoRepository<Faturamento, UUID> {


}

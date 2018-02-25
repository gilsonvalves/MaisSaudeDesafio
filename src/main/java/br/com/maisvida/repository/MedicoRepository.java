package br.com.maisvida.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.maisvida.model.Medico;

public interface MedicoRepository extends CrudRepository<Medico, Long> {

}

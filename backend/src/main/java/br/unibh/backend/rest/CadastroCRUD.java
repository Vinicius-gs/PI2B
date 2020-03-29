package br.unibh.backend.rest;

import org.springframework.data.repository.CrudRepository;
import br.unibh.backend.entities.Cadastro;

public interface CadastroCRUD extends CrudRepository <Cadastro,Long>  {

}

package br.com.hmslima.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.hmslima.backend.entity.Recado;

@CrossOrigin
@RepositoryRestResource(path = "recados")
public interface RecadosRepository extends JpaRepository<Recado, Integer> {

}

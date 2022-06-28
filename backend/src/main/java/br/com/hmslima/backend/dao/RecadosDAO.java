package br.com.hmslima.backend.dao;

import java.util.List;

import br.com.hmslima.backend.entity.Recado;

public interface RecadosDAO {

    public List<Recado> findAll();

    public Recado findById(int id);

    public void save(Recado recado);

    public void deleteById(int id);

}

package br.com.hmslima.backend.service;

import java.util.List;

import br.com.hmslima.backend.entity.Recado;

public interface RecadosService {

    public List<Recado> findAll();

    public Recado findById(int id);

    public void save(Recado recado);

    public void deleteById(int id);
    
}

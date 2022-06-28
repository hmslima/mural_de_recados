package br.com.hmslima.backend.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.hmslima.backend.dao.RecadosDAO;
import br.com.hmslima.backend.entity.Recado;

@Service
public class RecadosServiceImpl implements RecadosService {

    private RecadosDAO recadosDAO;

    //@Autowired
    public RecadosServiceImpl(RecadosDAO recadosDAO) {
        this.recadosDAO = recadosDAO;
    }

    @Override
    @Transactional
    public List<Recado> findAll() {
        return recadosDAO.findAll();
    }

    @Override
    @Transactional
    public Recado findById(int id) {
        return recadosDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Recado recado) {
        recadosDAO.save(recado);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        recadosDAO.deleteById(id);
    }

}

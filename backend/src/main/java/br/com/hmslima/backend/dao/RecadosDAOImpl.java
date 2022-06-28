package br.com.hmslima.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.hmslima.backend.entity.Recado;

@Repository
public class RecadosDAOImpl implements RecadosDAO {

    private EntityManager entityManager;

    //@Autowired
    public RecadosDAOImpl(EntityManager entityManager) {

        this.entityManager = entityManager;

    }

    @Override
    public List<Recado> findAll() {
        
        Query query = entityManager.createQuery("from Recado");
        List<Recado> recados = query.getResultList();
        return recados;
    }

    @Override
    public Recado findById(int id) {
        
        Recado recado = entityManager.find(Recado.class, id);

        return recado;
    }

    @Override
    public void save(Recado recado) {
        
        Recado recadoDB = entityManager.merge(recado);
        recadoDB.setId(recadoDB.getId());
    }

    @Override
    public void deleteById(int id) {

        Query query = entityManager.createQuery("delete from Recado where id:=recadoID");
        query.setParameter("recadoID", id);
        query.executeUpdate();
        
    }
    
}

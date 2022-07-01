package br.com.hmslima.backend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="recado")
public class Recado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="remetente")
    private String remetente;

    @Column(name="texto")
    private String texto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data", nullable=false)
    private Date data;

    @PrePersist
    private void onCreate() {
        data = new Date();
    }

    public Recado() {

    }

    public Recado(String remetente, String texto, Date data) {
        this.remetente = remetente;
        this.texto = texto;
        this.data = data;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}

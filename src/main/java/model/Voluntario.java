package model;

import java.util.ArrayList;
import java.util.List;

public class Voluntario {
    private String nome;
    private long id;
    private List<Telefone> fones;

    public Voluntario(String nome, long id) {
        this.nome = nome;
        this.id = id;//+100000;
        this.fones = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Telefone> getFones() {
        List<Telefone> tels = new ArrayList();
        tels.addAll(fones);
        return tels;
    }
    public void addFone(Telefone tel) {
        fones.add(tel);
    }
}

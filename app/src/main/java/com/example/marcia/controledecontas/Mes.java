package com.example.marcia.controledecontas;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcia on 25/10/2016.
 */
public class Mes extends SugarRecord {

    String nome;
    int numero;
    List<Despesas> despe;

    public Mes() {
    }

    public Mes(String nome, int numero, List<Despesas> despe) {
        this.nome = nome;
        this.numero = numero;
        this.despe = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Despesas> getDespe() {
        if (despe == null){
            despe = new ArrayList<>();
        }
        return despe;
    }

    public void setDespe(List<Despesas> despe) {
        this.despe = despe;
    }

    public String toString() {
        return  this.getNome();
    }
}

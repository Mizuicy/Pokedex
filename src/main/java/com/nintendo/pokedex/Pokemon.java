package com.nintendo.pokedex;


public class Pokemon {
    private String nome;
    private String Especie;
    private String Tipo;
    private int Nivel;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEspecie() {

        return Especie;
    }

    public void setEspecie(String especie) {

        Especie = especie;
    }

    public String getTipo() {

        return Tipo;
    }

    public void setTipo(String tipo) {

        Tipo = tipo;
    }

    public int getNivel() {

        return Nivel;
    }

    public void setNivel(int nivel) {

        Nivel = nivel;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

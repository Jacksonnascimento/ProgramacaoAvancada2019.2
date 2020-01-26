package com.br.ruy.padrao.template.dto;


public class MusicaMP3 {
    private String nome;
    private String autor;
    private int ano;
    private int estrela;

    public MusicaMP3(String nome, String autor, int ano, int estrela) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.estrela = estrela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }
    
    
    
    
}

package com.br.ruy.padrao.observer;


public abstract class DadosObserver {
    
    protected DadosSubject dados;
    
    public abstract void update();

    public DadosObserver(DadosSubject dados) {
        this.dados = dados;
    }
    
    
}

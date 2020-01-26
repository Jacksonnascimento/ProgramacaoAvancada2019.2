package com.br.ruy.padrao.observer;

public class CambioObserver extends DadosObserver{

    public CambioObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        String acaoa = "";
        String acaob = "";
        String acaoc = "";
        String acaod = "";
        
        if(dados.getState().getValora() < 5){
            acaoa="Compre!!!";
        }else{
            if ( (dados.getState().getValora() >=5) && 
                 (dados.getState().getValora() <19) ){
                acaoa="Aguarde.";
            }else{
                acaoa="Venda $$$$";
            }
        }
        
        if(dados.getState().getValorb() < 1){
            acaob="Compre!!!";
        }else{
            if ( (dados.getState().getValorb() >=1) && 
                 (dados.getState().getValorb() <10) ){
                acaob="Aguarde.";
            }else{
                acaob="Venda $$$$";
            }
        }
        
        if(dados.getState().getValorc() < 7){
            acaoc="Compre!!!";
        }else{
            if ( (dados.getState().getValorc() >=7) && 
                 (dados.getState().getValorc() <9) ){
                acaoc="Aguarde.";
            }else{
                acaoc="Venda $$$$";
            }
        }
        
        if(dados.getState().getValord() < -5){
            acaod="Compre!!!";
        }else{
            if ( (dados.getState().getValord() >=-5) && 
                 (dados.getState().getValord() <0) ){
                acaod="Aguarde.";
            }else{
                acaod="Venda $$$$";
            }
        }
        
        System.out.println("ACÃO DE CÂMBIO");
        System.out.println("Valor A:" + acaoa);
        System.out.println("Valor B:" + acaob);
        System.out.println("Valor C:" + acaoc);
        System.out.println("Valor D:" + acaod);
    }
    
}

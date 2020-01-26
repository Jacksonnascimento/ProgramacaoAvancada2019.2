package com.br.ruy.padrao.observer;

import java.text.DecimalFormat;


public class PercentObserver extends DadosObserver{

    public PercentObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        int soma  = dados.getState().getValora() +
                    dados.getState().getValorb() +
                    dados.getState().getValorc() +
                    dados.getState().getValord();
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        String perca = df.format(
               ( (double)dados.getState().getValora() / (double)soma ) * 100.00D
        );
        
        String percb = df.format(
               ( (double)dados.getState().getValorb() / (double)soma ) * 100.00D
        );
        
        String percc = df.format(
               ( (double)dados.getState().getValorc() / (double)soma ) * 100.00D
        );
        
        String percd = df.format(
               ( (double)dados.getState().getValord() / (double)soma ) * 100.00D
        );
        
        System.out.println("PORCENTAGEM:");
        System.out.println("Valor A:" + perca + "%");
        System.out.println("Valor B:" + percb + "%");
        System.out.println("Valor C:" + percc + "%");
        System.out.println("Valor D:" + percd + "%");
    }
    
}

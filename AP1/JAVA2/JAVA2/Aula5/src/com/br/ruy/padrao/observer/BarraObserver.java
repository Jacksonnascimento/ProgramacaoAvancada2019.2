package com.br.ruy.padrao.observer;


public class BarraObserver extends DadosObserver{

    public BarraObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        String barraa="";
        String barrab="";
        String barrac="";
        String barrad="";
        
        for(int i=0; i < dados.getState().getValora(); i++){
            barraa += "#";
        }
        for(int i=0; i < dados.getState().getValorb(); i++){
            barrab += "#";
        }
        for(int i=0; i < dados.getState().getValorc(); i++){
            barrac += "#";
        }
        for(int i=0; i < dados.getState().getValord(); i++){
            barrad += "#";
        }
        
        System.out.println("Gráfico de BARRAS:");
        System.out.println("Valor A:" + barraa );
        System.out.println("Valor B:" + barrab );
        System.out.println("Valor C:" + barrac );
        System.out.println("Valor D:" + barrad );
        
    }
    
}

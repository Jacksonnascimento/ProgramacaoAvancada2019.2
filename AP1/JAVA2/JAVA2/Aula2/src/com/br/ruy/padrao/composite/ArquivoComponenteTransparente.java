package com.br.ruy.padrao.composite;


public abstract class ArquivoComponenteTransparente {
    private String nomearquivo;

    public String getNomearquivo() {
        return nomearquivo;
    }

    public void setNomearquivo(String nomearquivo) {
        this.nomearquivo = nomearquivo;
    }
    
    public void printNomeDoArquivo(){
        System.out.println(getNomearquivo());
    }
    
    public void adicionar(ArquivoComponenteTransparente novoarquivo) 
                                                     throws Exception{
        throw new Exception("Não pode adicionar arquivo em: " +
                getNomearquivo() + " Não é pasta");
    }
    
    public void remover(String nomedoarquivo) throws Exception {
        throw new Exception("Não pode remover o arquivo :" +
                getNomearquivo() + " não é pasta");
    }
    
    public ArquivoComponenteTransparente getArquivo(String nomedoarquivo) 
                                                            throws Exception{
        throw new Exception("Não pode pesquisar o aquivo em :" +
                getNomearquivo());
    }
}

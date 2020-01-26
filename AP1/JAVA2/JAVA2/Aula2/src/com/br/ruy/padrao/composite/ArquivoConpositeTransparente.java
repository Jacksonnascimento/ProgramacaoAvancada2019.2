package com.br.ruy.padrao.composite;

import java.util.ArrayList;

public class ArquivoConpositeTransparente extends ArquivoComponenteTransparente {

    ArrayList<ArquivoComponenteTransparente> arquivos
            = new ArrayList<ArquivoComponenteTransparente>();

    public ArquivoConpositeTransparente(String nomedoaqruivo) {
        this.setNomearquivo(nomedoaqruivo);
    }

    @Override
    public void adicionar(ArquivoComponenteTransparente novoarquivo) {
        this.arquivos.add(novoarquivo);
    }

    @Override
    public void remover(String nomedoarquivo) throws Exception {
        for (ArquivoComponenteTransparente arquivo : arquivos) {
            if (arquivo.getNomearquivo().equalsIgnoreCase(nomedoarquivo)) {
                this.arquivos.remove(arquivo);
                return;
            }
        }
        throw new Exception("Não encontrei o arquivo");
    }

    @Override
    public ArquivoComponenteTransparente getArquivo(String nomedoarquivo) throws Exception {
        for (ArquivoComponenteTransparente arquivo : arquivos) {
            if (arquivo.getNomearquivo().equalsIgnoreCase(nomedoarquivo)) {
                return arquivo;
            }
        }
        throw new Exception("Não encontrei o arquivo");
    }

}

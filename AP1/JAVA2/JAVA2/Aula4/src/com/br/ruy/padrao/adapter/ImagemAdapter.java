package com.br.ruy.padrao.adapter;


public class ImagemAdapter extends Surface implements IImagemTarget{

    @Override
    public void setCarregarImagem(String nomedoarquivo) {
        setCarregarSurface(nomedoarquivo);
    }

    @Override
    public void getDesenharImagem(int posx, int posy, int largura, int altura) {
        setDesenhaSurface(largura, altura, posx, posy);
    }
    
}

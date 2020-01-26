package com.br.ruy.padrao.adapter;


public class OpenGLImagem {
    
    public void setGlCarregarImagem(String arquivo){
        //Implementação de carregamento de uma imagem OpenGL..
        
        System.out.println("Imagem carregada: " + arquivo);
    }
    
    public void setDesenhaImagem(int posicaox, int posicaoy){
        //Draw da imagem OpenGel
        
        System.out.println("Open GL imagem desnhada: " + 
                           " X: " + posicaox +
                           ", Y: " + posicaoy);
        
    }
    
}


package com.br.ruy.padrao.adapter;

// Padrão GoF, do grupo: Estrutural, Adapter
public class Surface {
    
    public void setCarregarSurface(String arquivo){
        //Implementar a lógica de carregar um arquivo...
        System.out.println("Surface carregado: " + arquivo);
    }
    
    public void setDesenhaSurface(int largura, int altura,
                                  int posicaox, int posicaoy){
        //Implementação de desenhar o arquivo na Surface
        
        System.out.println("Surface desenhado " + 
                           " L:" + largura +
                           " A:" +  altura + 
                           " X:" + posicaox +
                           " Y:" + posicaoy);
    }
    
}

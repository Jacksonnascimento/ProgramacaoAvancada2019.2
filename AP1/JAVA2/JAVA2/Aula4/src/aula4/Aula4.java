
package aula4;

import com.br.ruy.padrao.adapter.IImagemTarget;
import com.br.ruy.padrao.adapter.ImagemAdapter;
import com.br.ruy.padrao.adapter.OpenGLImagemAdapter;
import com.br.ruy.padrao.singleton.Pessoa;


public class Aula4 {

    public static void main(String[] args) {
        
        IImagemTarget imagem = new ImagemAdapter();
        imagem.setCarregarImagem("FiguraDeCasa.png");
        imagem.getDesenharImagem(0, 1, 10, 20);
        
        imagem = new OpenGLImagemAdapter();
        imagem.setCarregarImagem("FiguraPlanoDeFundo.jpeg");
        imagem.getDesenharImagem(1, 4, 50, 60);
        
        //---------------------------------------
        // SINGLETON
        //---------------------------------------
        System.out.println("====================================");
        Pessoa p1 = Pessoa.getInstancia();
        Pessoa p2 = Pessoa.getInstancia();
        
        p1.setNome("Zé das couves");
        p1.setCpf("1234");
        p1.setAltura(1.8F);
        
        p2.setNome("Maria da Mariola");
        p2.setCpf("9876");
        p2.setAltura(1.4F);
        
        System.out.println("P1: " + p1.getNome() + 
                           " " + p2.getCpf() +
                           " " + p1.getAltura());
        
        System.out.println("P2: " + p2.getNome() + 
                           " " + p1.getCpf() +
                           " " + p2.getAltura());
        
        System.out.println(p1);
        System.out.println(p2);
       
    }
    
}

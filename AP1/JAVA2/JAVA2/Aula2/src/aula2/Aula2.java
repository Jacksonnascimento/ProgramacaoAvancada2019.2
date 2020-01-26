package aula2;

import com.br.ruy.padrao.composite.ArquivoComponenteTransparente;
import com.br.ruy.padrao.composite.ArquivoConpositeTransparente;


public class Aula2 {


    public static void main(String[] args) {
        ArquivoComponenteTransparente pasta1 = 
                new ArquivoConpositeTransparente("Minha pasta/");
        
        ArquivoComponenteTransparente pasta2 = 
                new ArquivoConpositeTransparente("pasta2/");
        
        ArquivoComponenteTransparente video1 =
                new ArquivoConpositeTransparente("video.avi");
        
        ArquivoComponenteTransparente video2 =
                new ArquivoConpositeTransparente("video.mkv");
        
        ArquivoComponenteTransparente video3 =
                new ArquivoConpositeTransparente("video.mp4");
        
        
        try {
            video1.adicionar(video2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            pasta1.adicionar(video1);
            pasta1.adicionar(video2);
            pasta1.adicionar(pasta2);
            pasta2.adicionar(video3);
            
            pasta2.printNomeDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("Pesquisando::");
            pasta1.getArquivo(video1.getNomearquivo()).printNomeDoArquivo();
            System.out.println("Removendo:::");
            pasta1.remover(video1.getNomearquivo());
            pasta1.printNomeDoArquivo();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    
}

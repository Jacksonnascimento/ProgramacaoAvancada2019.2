package aula3;

import com.br.ruy.padrao.template.dto.MusicaMP3;
import com.br.ruy.padrao.template.enumerador.ModoDeReproducao;
import com.br.ruy.play.PlayList;


public class Aula3 {


    public static void main(String[] args) {
        MusicaMP3 m1 = new MusicaMP3("Everlong", "Foo Fighters", 1997, 5);
        MusicaMP3 m2 = new MusicaMP3("Construção", "Chico Buarque", 1976, 4);
        MusicaMP3 m3 = new MusicaMP3("Segura o Tchan", "É o tchan", 1997, -50);
        MusicaMP3 m4 = new MusicaMP3("Aquarela", "Toquinho", 1972, 6);
        MusicaMP3 m5 = new MusicaMP3("Meu bb", "Pablo", 2015, -200);
        
        PlayList minhalista = new PlayList(ModoDeReproducao.porAno);
        minhalista.adicionarMusica(m1);
        minhalista.adicionarMusica(m2);
        minhalista.adicionarMusica(m3);
        minhalista.adicionarMusica(m4);
        minhalista.adicionarMusica(m5);
        
        System.out.println("ORDENANDO POR ANO");
        minhalista.mostrarListaDeReproducao();
        
        System.out.println("ORDENADO POR NOME");
        minhalista.setModoDeReproducao(ModoDeReproducao.porNome);
        minhalista.mostrarListaDeReproducao();
        
        System.out.println("ORDENADO POR AUTOR");
        minhalista.setModoDeReproducao(ModoDeReproducao.porAutor);
        minhalista.mostrarListaDeReproducao();
        
        System.out.println("ORDENADO POR ESTRELA");
        minhalista.setModoDeReproducao(ModoDeReproducao.porEstrela);
        minhalista.mostrarListaDeReproducao();
    }
    
}

package aula5;

import com.br.ruy.padrao.observer.BarraObserver;
import com.br.ruy.padrao.observer.CambioObserver;
import com.br.ruy.padrao.observer.Dados;
import com.br.ruy.padrao.observer.DadosSubject;
import com.br.ruy.padrao.observer.PercentObserver;
import com.br.ruy.padrao.observer.TabelaObserver;


public class Aula5 {


    public static void main(String[] args) {
        DadosSubject dados = new DadosSubject();
        
        dados.attach( new TabelaObserver(dados) );
        dados.attach( new BarraObserver(dados) );
        dados.attach( new PercentObserver(dados) );
        dados.attach(new CambioObserver(dados) );
        
        dados.setState( new Dados(1, 2, 2, 5) );
        // Tempo passa......
        dados.setState( new Dados(3, 1, 4, 2) );
        //Tempo passando;......
        dados.setState( new Dados(5, 21, 44, 12) );
   }
    
}

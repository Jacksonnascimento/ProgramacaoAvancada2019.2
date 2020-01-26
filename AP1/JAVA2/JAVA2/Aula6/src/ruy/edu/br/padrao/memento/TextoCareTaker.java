package ruy.edu.br.padrao.memento;

import java.util.ArrayList;


public class TextoCareTaker {
    protected ArrayList<TextoMemento> estados;

    public TextoCareTaker() {
        estados = new ArrayList<TextoMemento>();
    }
    
    public void adicionarMemento(TextoMemento memento){
        estados.add(memento);
    }
    
    public TextoMemento getUltimoEstadoSalvo(){
        int tamanho = estados.size();
        
        if(tamanho <=0){
            return new TextoMemento("");
        }        
        TextoMemento estadosalvo = estados.get(tamanho-1);
        estados.remove(tamanho-1);
        
        return estadosalvo;
    }
    
    
    
    
}

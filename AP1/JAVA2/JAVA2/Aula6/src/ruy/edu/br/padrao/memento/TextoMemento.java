package ruy.edu.br.padrao.memento;

public class TextoMemento {
    protected String estadodotexto;

    public TextoMemento(String estadodotexto) {
        this.estadodotexto = estadodotexto;
    }
    
    public String getTextoSalvo(){
        return estadodotexto;
    }
    
}

package ruy.edu.br.padrao.memento;


public class Texto {
    protected String texto;
    protected TextoCareTaker caretaker;

    public Texto() {
        caretaker = new TextoCareTaker();
        texto = new String();
    }
    
    public void escreverTexto(String novotexto){
        
        caretaker.adicionarMemento( new TextoMemento(novotexto)  );
        texto += novotexto;
    }
    
    public void desfazerEscrita(){
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }
    
    public void mostrarTexto(){
        System.out.println(texto);
    }  
    
}

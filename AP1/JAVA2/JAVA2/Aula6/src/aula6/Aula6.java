package aula6;

import ruy.edu.br.padrao.memento.Texto;


public class Aula6 {


    public static void main(String[] args) {
        Texto texto = new Texto();
        
        texto.escreverTexto("Primeiro texto escrito\n");
        texto.escreverTexto("Segundo texto aqui !!!\n");
        texto.escreverTexto("Terceiro olha que legal %%%%\n");
        texto.escreverTexto("Ultima linha escrita..... Tchau!!!\n");
        texto.mostrarTexto();
        
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        System.out.println("----------------------------------------");
        texto.mostrarTexto();
    }
    
}

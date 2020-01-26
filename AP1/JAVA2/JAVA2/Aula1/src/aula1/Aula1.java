package aula1;

import src.Circulo;
import src.Ponto;


public class Aula1 {


    public static void main(String[] args) {
        Ponto m = new Ponto();
        Ponto n = new Ponto(10, 20);
        
        System.out.println(m);
        System.out.println(n);
        
        Circulo o = new Circulo();
        Circulo p = new Circulo(8.9);
        Circulo q = new Circulo(12.3, 23, 34);
        
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        
        Ponto p1, p2;
        Circulo c1, c2;
        
        p1 = new Ponto(10, 10);
        c1 = new Circulo(1.34, 50, 67);
        System.out.println("P1 =" + p1);
        System.out.println("C1 =" + c1);
        
        //Coersao (conversao) de super para sub
        // Usaremos a máxima "É UMA"
        p2 = c1;
        System.out.println("P2 (via circulo) =" + p2);
        
        
        //Convesao explicita sub para super;
        c2 = (Circulo)p2;
        System.out.println("C2 (via ponto) =" + c2);
        
        if(p1 instanceof Circulo){
            c2 = (Circulo)p1;
        }else{
            System.out.println("Não é uma instância Válida");
        }
        
        
    }
    
}

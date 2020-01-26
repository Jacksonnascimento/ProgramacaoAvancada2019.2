package aula8;

import frb.edu.br.padrao.strategy.Funcionario;


public class Aula8 {


    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(2100.0, Funcionario.DESENVOLVEDOR, "Zé Ramalho");
        Funcionario funcionario2 = new Funcionario(1700.0, Funcionario.ANALISTA, "Jão Estágio");      
        Funcionario funcionario3 = new Funcionario(4000, Funcionario.GERENTE, "Chefe Legal");
        
        System.out.println("Funcionário :" + funcionario1.getNome());
        System.out.println("      Cargo :" + funcionario1.getDescricaocargo());
        System.out.println("   Sal Base :" + funcionario1.getSalariobruto());
        System.out.println("Sal líquido :" + funcionario1.getCalculaSalarioLiquido());
        System.out.println("----------------------------------------------------");
        
        System.out.println("Funcionário :" + funcionario2.getNome());
        System.out.println("      Cargo :" + funcionario2.getDescricaocargo());
        System.out.println("   Sal Base :" + funcionario2.getSalariobruto());
        System.out.println("Sal líquido :" + funcionario2.getCalculaSalarioLiquido());
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("Funcionário :" + funcionario3.getNome());
        System.out.println("      Cargo :" + funcionario3.getDescricaocargo());
        System.out.println("   Sal Base :" + funcionario3.getSalariobruto());
        System.out.println("Sal líquido :" + funcionario3.getCalculaSalarioLiquido());
        System.out.println("----------------------------------------------------");

        
    }
    
}

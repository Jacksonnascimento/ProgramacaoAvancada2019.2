package ruy.edu.padrao.state;

public class MarioCapa implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Maio cospe fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    
}

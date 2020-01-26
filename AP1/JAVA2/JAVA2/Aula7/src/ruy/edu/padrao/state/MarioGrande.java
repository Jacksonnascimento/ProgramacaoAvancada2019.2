package ruy.edu.padrao.state;


public class MarioGrande implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Ganha 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario cospe fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario ganha uma capa");
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario pequeno");
        return new MarioPequeno();
    }
    
}

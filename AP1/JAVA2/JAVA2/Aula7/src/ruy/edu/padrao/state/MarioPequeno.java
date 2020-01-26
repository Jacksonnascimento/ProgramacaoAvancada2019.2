package ruy.edu.padrao.state;


public class MarioPequeno implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganha 1000 pontos");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario cospe fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario com capa");
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Morto.... GameOver");
        return new MarioMorto();
    }
    
}

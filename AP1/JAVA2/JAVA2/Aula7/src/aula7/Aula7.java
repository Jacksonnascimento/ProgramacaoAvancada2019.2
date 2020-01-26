package aula7;

import java.util.Random;
import ruy.edu.padrao.state.Mario;

public class Aula7 {

    public static void main(String[] args) {
        Mario mario = new Mario();
        Random rnd = new Random();
        int op;
        boolean ok = true;

        while (ok) {
            op = rnd.nextInt(4) + 1;
            if (mario == null) {
                ok = false;
            } else {
                switch (op) {
                    case 1:
                        mario.pegarCogumelo();
                        break;
                    case 2:
                        mario.pegarFlor();
                        break;
                    case 3:
                        mario.pegarPena();
                        break;
                    case 4:
                        mario.levarDano();
                        break;
                }
            }
        }

    }

}

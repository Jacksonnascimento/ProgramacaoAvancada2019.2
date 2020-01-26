package src;


public class Circulo extends Ponto{
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public Circulo(double raio, int x, int y) {
        super(x, y);
        setRaio(raio);
    }

    public Circulo() {
        setRaio(0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio>0){
            this.raio = raio;
        }else{
            this.raio = 0;
        }        
    }

    @Override
    public String toString() {
        return "Circulo [ RAIO=" + getRaio() + " - " + super.toString() + "]"; 
    }
    
    
    
    
}

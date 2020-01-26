package src;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x=0;
        this.y=0;
    }    
    
    @Override
    public String toString(){
        return "Ponto [X=" + this.x +", Y=" + this.y + "]";
        
    }
}

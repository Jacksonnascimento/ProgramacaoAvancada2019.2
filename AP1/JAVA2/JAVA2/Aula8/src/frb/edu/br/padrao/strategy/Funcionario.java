package frb.edu.br.padrao.strategy;


public class Funcionario {
    public static final int DESENVOLVEDOR = 1;
    public static final int GERENTE = 2;
    public static final int ANALISTA = 3;
            
    protected double salariobruto;
    protected int cargo;
    protected String nome;
    protected String descricaocargo;
    
    protected CalculaImposto strategydecalculo;
    

    public Funcionario(double salariobruto, int cargo, String nome) {
        this.salariobruto = salariobruto;
        this.cargo = cargo;
        this.nome = nome;
        switch(cargo){
            case DESENVOLVEDOR:
                strategydecalculo = new CalculoImpostoQuinzeOuDez();
                break;
                
            case GERENTE:
                strategydecalculo = new CalculoImpostoVinteOuQuinze();
                break;
                
            case ANALISTA:
                strategydecalculo = new CalculoImpostoQuinzeOuDez();
                break;
            
            default:
                throw new RuntimeException("Este cargo não está definido..");
        }
    }

    public String getDescricaocargo() {
        switch(cargo){
            case DESENVOLVEDOR:
                descricaocargo = "Desenvolvedor";
                break;
                
            case GERENTE:
                descricaocargo = "Gerente";
                break;
                
            case ANALISTA:
                descricaocargo = "Analista";
                break;
            
            default:
                throw new RuntimeException("Este cargo não está definido..");
        }
        return descricaocargo;
    }
    
    public double getCalculaSalarioLiquido(){
        return strategydecalculo.calculaSalarioComImposto(this);
    }

    public double getSalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

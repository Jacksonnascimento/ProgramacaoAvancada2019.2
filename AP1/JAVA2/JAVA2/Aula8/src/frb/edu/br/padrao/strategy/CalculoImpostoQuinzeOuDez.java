package frb.edu.br.padrao.strategy;


public class CalculoImpostoQuinzeOuDez implements CalculaImposto{

    @Override
    public double calculaSalarioComImposto(Funcionario umfuncionario) {
        if(umfuncionario.getSalariobruto() > 2000){
            return umfuncionario.getSalariobruto() * 0.85;
        }
        return umfuncionario.getSalariobruto() * 0.9;                
    }
}

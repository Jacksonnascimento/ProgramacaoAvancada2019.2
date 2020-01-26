package frb.edu.br.padrao.strategy;


public class CalculoImpostoVinteOuQuinze implements CalculaImposto{

    @Override
    public double calculaSalarioComImposto(Funcionario umfuncionario) {
        if(umfuncionario.getSalariobruto() > 3500){
            return umfuncionario.getSalariobruto() * 0.8;
        }
        return umfuncionario.getSalariobruto() * 0.85;
    }
    
}

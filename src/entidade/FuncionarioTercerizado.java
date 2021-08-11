package entidade;

public class FuncionarioTercerizado extends Funcionario {
	private double despesaAdicional;
	
	public FuncionarioTercerizado() {
	}

	public FuncionarioTercerizado(String nome, int hora, double valorPorHora, double despesaAdicional) {
		super(nome, hora, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
	
	
	

}

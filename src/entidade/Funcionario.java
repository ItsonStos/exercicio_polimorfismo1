package entidade;

public class Funcionario {
	private String nome;
	private int hora;
	private double valorPorHora;
	
	public Funcionario () {
	}

	public Funcionario(String nome, int hora, double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double pagamento() {
		return hora * valorPorHora;
	}
	

}

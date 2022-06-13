
public class Gerente extends Funcionario {

	private double gratificacao;
	
	public String listarFuncionario() {
		return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nSalario Base: " + getSalarioBase() + "\nSalario Final: " + getSalarioFinal() + "\nBonificação: " + getValorBonificacao();
	}
	public void calcularSalarioFinal(double gratificacao) {
		this.gratificacao = gratificacao;
		setSalarioFinal(gratificacao + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + gratificacao + getSalarioFinal();
	}
}

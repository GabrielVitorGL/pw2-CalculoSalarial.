
public class Gerente extends Funcionario {

	private double gratificacao;
	
	public void listarFuncionario() {
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Salario Base: " + getSalarioBase());
		System.out.println("Salario Final: " + getSalarioFinal());
		System.out.println("Bonificação: " + getValorBonificacao());
	}
	public void calcularSalarioFinal(double gratificacao) {
		this.gratificacao = gratificacao;
		setSalarioFinal(gratificacao + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + gratificacao + getSalarioFinal();
	}
}

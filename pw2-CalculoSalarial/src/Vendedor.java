
public class Vendedor extends Funcionario {
		private double valorComissao;
	public void listarFuncionario() {
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Salario Base: " + getSalarioBase());
		System.out.println("Salario Final: " + getSalarioFinal());
		System.out.println("Bonificação: " + getValorBonificacao());
	}
	public void calcularSalarioFinal(double valorComissao) {
		this.valorComissao = valorComissao;
		setSalarioFinal(valorComissao + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + valorComissao + getSalarioFinal();
	}
}

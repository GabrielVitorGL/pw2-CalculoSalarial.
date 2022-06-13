
public class Vendedor extends Funcionario {
		private double valorComissao;
	public String listarFuncionario() {
		return "CPF: " + getCpf() + "Nome: " + getNome() + "\nSalario Base: " + getSalarioBase() + "\nSalario Final: " + getSalarioFinal() + "\nBonificação: " + getValorBonificacao();
	}
	public void calcularSalarioFinal(double valorComissao) {
		this.valorComissao = valorComissao;
		setSalarioFinal(valorComissao + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + valorComissao + getSalarioFinal();
	}
}

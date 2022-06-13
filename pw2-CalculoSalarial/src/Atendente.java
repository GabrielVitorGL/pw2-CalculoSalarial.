
public class Atendente extends Funcionario {
	private double adcionalNoturno;
	public void listarFuncionario() {
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Salario Base: " + getSalarioBase());
		System.out.println("Salario Final: " + getSalarioFinal());
		System.out.println("Bonificação: " + getValorBonificacao());
	}
	public void calcularSalarioFinal(double adcionalNoturno) {
		this.adcionalNoturno = adcionalNoturno;
		setSalarioFinal(adcionalNoturno + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + adcionalNoturno + getSalarioFinal();
	}
	
}

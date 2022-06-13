
public class Atendente extends Funcionario {
	private double adcionalNoturno;
	public String listarFuncionario() {
		return "CPF: " + getCpf() + "Nome: " + getNome() + "\nSalario Base: " + getSalarioBase() + "\nSalario Final: " + getSalarioFinal() + "\nBonificação: " + getValorBonificacao();
	}
	public void calcularSalarioFinal(double adcionalNoturno) {
		this.adcionalNoturno = adcionalNoturno;
		setSalarioFinal(adcionalNoturno + getSalarioBase()+ getValorBonificacao());
	}
	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + adcionalNoturno + getSalarioFinal();
	}
	
}

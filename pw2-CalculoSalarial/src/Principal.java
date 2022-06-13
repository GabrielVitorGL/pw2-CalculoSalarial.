import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		Atendente atendente = new Atendente();
		System.out.printf("1-Gerente\n2-Vendedor\n3-Atendente\n0-Sair\n\nDigite uma opção: ");
		Scanner s = new Scanner(System.in);
		int opcao = s.nextInt();
		if (opcao == 1) {
			do {
				System.out.printf("--GERENTE--\n\n1-Cadastrar Funcionario\n2-Calcular Salário\n3-Calcular Bonificação\n4-Apresentar Salário Final\n5-Listar Funcionário\n0- Sair\n\nDigite uma opção: ");
				opcao = s.nextInt();
				if (opcao == 1) {
					System.out.printf("\nDigite seu nome: ");
					String nome = s.next();
					System.out.printf("Digite seu CPF: ");
					String cpf = s.next();
					System.out.printf("Digite seu salário base: ");
					double salarioBase = s.nextDouble();
					gerente.cadastrarFuncionario(nome, cpf, salarioBase);
					
				}
				else if (opcao == 2) {
					System.out.printf("Digite a gratificação: ");
					double gratificacao = s.nextDouble();
					gerente.calcularSalarioFinal(gratificacao);
					System.out.printf("GRATIFICAÇÃO CALCULADA");
				}
				else if (opcao == 3) {
					gerente.calcularBonificacao();
					System.out.printf("BONIFICAÇÃO CALCULADA");
				}
				else if (opcao == 4) {
					System.out.printf("Salário final: " + gerente.getSalarioFinal() + "\n");
				}
				else if (opcao == 5) {
					System.out.println(gerente.listarFuncionario());
					System.out.printf("\n");
				}
				else {
					return;
				}
			}while (opcao != 0);
		}
		else if (opcao == 2) {
			System.out.printf("--VENDEDOR--\n\n1-Cadastrar Funcionario\n2-Calcular Salário\n3-Calcular Bonificação\n4-Calcular Salário Final\n5-Listar Funcionário\n0- Sair\n\nDigite uma opção: ");
			opcao = s.nextInt();
		}
		else if (opcao == 3) {
			System.out.printf("--ATENDENTE--\n\n1-Cadastrar Funcionario\n2-Calcular Salário\n3-Calcular Bonificação\n4-Calcular Salário Final\n5-Listar Funcionário\n0- Sair\n\nDigite uma opção: ");
			opcao = s.nextInt();
		}
		else {
			return;
		}
	}
}

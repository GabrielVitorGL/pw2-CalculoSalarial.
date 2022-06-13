import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		Atendente atendente = new Atendente();
		System.out.printf("1-Gerente\n2-Vendedor\n3-Atendente\n0-Sair\n\nDigite uma op��o: ");
		Scanner s = new Scanner(System.in);
		int opcao = s.nextInt();
		if (opcao == 1) {
			do {
				System.out.printf("--GERENTE--\n\n1-Cadastrar Funcionario\n2-Calcular Sal�rio\n3-Calcular Bonifica��o\n4-Apresentar Sal�rio Final\n5-Listar Funcion�rio\n0- Sair\n\nDigite uma op��o: ");
				opcao = s.nextInt();
				if (opcao == 1) {
					System.out.printf("\nDigite seu nome: ");
					String nome = s.next();
					System.out.printf("Digite seu CPF: ");
					String cpf = s.next();
					System.out.printf("Digite seu sal�rio base: ");
					double salarioBase = s.nextDouble();
					gerente.cadastrarFuncionario(nome, cpf, salarioBase);
					
				}
				else if (opcao == 2) {
					System.out.printf("Digite a gratifica��o: ");
					double gratificacao = s.nextDouble();
					gerente.calcularSalarioFinal(gratificacao);
					System.out.printf("GRATIFICA��O CALCULADA");
				}
				else if (opcao == 3) {
					gerente.calcularBonificacao();
					System.out.printf("BONIFICA��O CALCULADA");
				}
				else if (opcao == 4) {
					System.out.printf("Sal�rio final: " + gerente.getSalarioFinal() + "\n");
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
			System.out.printf("--VENDEDOR--\n\n1-Cadastrar Funcionario\n2-Calcular Sal�rio\n3-Calcular Bonifica��o\n4-Calcular Sal�rio Final\n5-Listar Funcion�rio\n0- Sair\n\nDigite uma op��o: ");
			opcao = s.nextInt();
		}
		else if (opcao == 3) {
			System.out.printf("--ATENDENTE--\n\n1-Cadastrar Funcionario\n2-Calcular Sal�rio\n3-Calcular Bonifica��o\n4-Calcular Sal�rio Final\n5-Listar Funcion�rio\n0- Sair\n\nDigite uma op��o: ");
			opcao = s.nextInt();
		}
		else {
			return;
		}
	}
}

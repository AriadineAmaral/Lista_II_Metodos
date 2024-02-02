package metodos;

import java.util.Scanner;

public class Ex4 {

	static Scanner e = new Scanner(System.in);
	static int chamado[][] = new int[5][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod1 = 0;
		int cod2 = 0;
		int cod3 = 0;
		
		int	criterio[] = new int [4];

		registarChamado();
		relatorio (cod1, cod2, cod3);
		qtdCriterios (criterio);

	}// main

//A-)

	public static int[][] registarChamado() {

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "º chamado");

			System.out.println("Digite a identificação do funcionário: ");
			chamado[i][0] = e.nextInt();

			System.out.println("Digite o código do erro: ");
			System.out.println(
					"1 - Sistema não inicia\n2 - Nome ou caminho do banco de dados não encontrad\n3 - Sistema não responde ");
			chamado[i][1] = e.nextInt();

			while (chamado[i][1] < 1 || chamado[i][1] > 3) {
				System.out.println("Código de erro inválido. Digite novamente (1 a 3): ");
				System.out.println(
						"1 - Sistema não inicia\n2 - Nome ou caminho do banco de dados não encontrad\n3 - Sistema não responde ");
				chamado[i][1] = e.nextInt();
			}

			System.out.println("Digite o critério do chamado: ");
			System.out.println("0 à 1 - Sistema parado\n1 a 2 - Grave\n2 a 3 - Não Grave\n3 a 4 - Dúvida ou questão");
			chamado[i][2] = e.nextInt();

			while (chamado[i][2] < 0 || chamado[i][2] > 4) {
				System.out.println("Critério de chamado inválido. Digite novamente (0 a 4): ");
				System.out
						.println("0 a 1 - Sistema parado\n1 a 2 - Grave\n2 a 3 - Não Grave\n3 a 4 - Dúvida ou questão");
				chamado[i][2] = e.nextInt();
			}
		}

		return chamado;
		
	}

//B-)

	public static void relatorio(int cod1, int cod2, int cod3) {

		for (int i = 0; i < 5; i++) {
			if (chamado[i][1] == 1) {
				cod1++;
			} else {
				if (chamado[i][1] == 2) {
					cod2++;
				} else {
					cod3++;
				}
			}
			

		}
		System.out.println("");
		System.out.println("-----------RELATÓRIO DE CHAMADOS POR ERRO-----------");
		System.out.println("Números de chamados com o código 1: " + cod1);
		System.out.println("Números de chamados com o código 2: " + cod2);
		System.out.println("Números de chamados com o código 3: " + cod3);
		
	}

// C-)
	
	public static int[] qtdCriterios( int criterio[] ) {
		
	
		
		for (int i = 0; i < 5; i++) {
			if (chamado[i][2] == 1) {
				criterio [0]++;
			} else {
				if (chamado[i][2] == 2) {
					criterio [1]++;
				} else {
					if (chamado[i][2] == 3) {
						criterio [2]++;
					} else {
						criterio [3]++;
					}
					
				}
			}
			

		}
		
		System.out.println("");
		System.out.println("-----------RELATÓRIO DE CHAMADOS DE CRITÉRIOS-----------");
		System.out.println("Número de chamados - Sistema parado: " + criterio[0]);
		System.out.println("Número de chamados - Grave: " + criterio[1]);
		System.out.println("Número de chamados - Não grave: " + criterio[2]);
		System.out.println("Número de chamados - Dúvida: " + criterio[3]);
		return criterio;
	}
}

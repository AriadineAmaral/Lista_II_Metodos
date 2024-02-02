package metodos;

import java.util.Scanner;

public class Ex3 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomes[] = new String[4];
		double salario[] = new double[4];
		double tempoServ[] = new double[4];
		double novoSalario[] = new double[4];
		String aumento = "";

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "° funcionário");
			nomes[i] = e.next();

			System.out.println("Digite o salário atual do(a) " + nomes[i]);
			salario[i] = e.nextDouble();

			System.out.println("Digite o tempo de serviço do(a) " + nomes[i]);
			tempoServ[i] = e.nextDouble();

			novoSalario = calcularAumento(nomes, salario, tempoServ);
		}

		mostrarAumento(nomes, novoSalario, tempoServ, salario);

	} // main

	public static double[] calcularAumento(String nomes[], double salario[], double tempoServ[]) {

		double novoSalario[] = new double[4];

		for (int i = 0; i < 4; i++) {

			if (tempoServ[i] > 3 || salario[i] < 700) {
				novoSalario[i] = salario[i] * 1.10;

			} else {
				novoSalario[i] = salario[i] * 1.10;
			}
		}
		return novoSalario;
	}

	public static void mostrarAumento(String nomes[], double novoSalario[], double tempoServ[], double salario[]) {

		String aumento = "";

		for (int i = 0; i < 4; i++) {

			if (tempoServ[i] > 3 || salario[i] < 700) {
				System.out.println(nomes[i] + " - teve aumento");

			} else {
				System.out.println(nomes[i] + " - não teve aumento");
			}
		}

	}

}

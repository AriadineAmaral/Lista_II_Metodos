package metodos;

import java.util.Scanner;

public class Ex1 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hospede;
		int acomodacao = 0;
		double valorD = 0;
		int diarias = 0;
		double estadia = 0;
		String pagamento;
		double valorFinal=0;

		System.out.println("Digite o nome do hospede:");
		hospede = e.next();

		System.out.println("Digite o tipo de acomodação:");
		System.out.println("1 - (Standard)\n2 - (Luxo)\n3 - (Super Luxo)");
		acomodacao = e.nextInt();

		if (acomodacao == 1) {
			valorD = 380;
		} else {
			if (acomodacao == 2) {
				valorD = 450;
			} else {
				valorD = 560;

			}
		}

		while (acomodacao <= 0 || acomodacao > 3) {
			System.out.println("Digite um tipo de acomodação válido:");
			System.out.println("1 - (Standard)\n2 - (Luxo)\n3 - (Super Luxo)");
			acomodacao = e.nextInt();

		}

		System.out.println("Digite a quantidade de diárias " + hospede + " ficou hospedado(a)");
		diarias = e.nextInt();

		estadia = calcularEstadia(valorD, diarias);

		System.out.println("O valor da estadia do(a) " + hospede + " foi de: R$" + estadia);

		System.out.println("Qual será a forma de pagamento?");
		System.out.println("Digite:\nV - à vista\nP - à prazo ");
		pagamento = e.next().toUpperCase();

		while (!(pagamento.equals("V") || pagamento.equals("P"))) {
			System.out.println("Digite uma forma de pagamento válida");
			System.out.println("Digite:\nV - à vista\nP - à prazo ");
			pagamento = e.next().toUpperCase();
		}
		
		valorFinal = calcularFinal(pagamento, estadia);
		
		System.out.println("O valor final da estadia do(a) " + hospede+ " foi de: R$" + valorFinal);
		

	}// main

	public static double calcularEstadia(double valorD, int diarias) {

		double estadia = 0;
		estadia = valorD * diarias;

		return estadia;
	}
	
	public static double calcularFinal(String pagamento, double estadia ) {
		
		double valorFinal = 0;
		
		if (pagamento.equalsIgnoreCase("v")) {
			valorFinal = estadia * 0.90;
			
		} else if (pagamento.equalsIgnoreCase("p")) {
				valorFinal = estadia;
			}
		
		return valorFinal;
		
	}

}

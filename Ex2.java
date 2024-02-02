package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat moeda = new DecimalFormat ("R$#,##0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codEstado = 0;
		int cargaT = 0;
		double precoQ = 0;
		double precoFinal = 0;
		double imposto = 0;

		System.out.println("Digite o código do caminhão");
		codEstado = e.nextInt();

		while (codEstado <= 0 || codEstado > 4) {
			System.out.println("Digite um código válido: 1, 2, 3, ou 4:");
			codEstado = e.nextInt();
		}

		if (codEstado == 1) {
			imposto = 25;

		} else {
			if (codEstado == 2) {
				imposto = 20;

			} else {
				if (codEstado == 3) {
					imposto = 15;
				} else {
					imposto = 0;

				}
			}

		}

		System.out.println("Digite a carga do caminhão em toneladas:");
		cargaT = e.nextInt();

		precoQ = calcularCarga(cargaT);

		precoFinal = calcularImposto(precoQ, codEstado);

		System.out.println("O valor total do caminhão será de: " + moeda.format(precoFinal) + "\n" +
		"Valor sem imposto: " + moeda.format(precoQ) + "\nImposto aplicado: " + imposto + "%");
	}// main

	public static double calcularCarga(int cargaT) {

		int codCarga = 0;
		double precoQ = 0;

		System.out.println("Digite o código da carga");
		codCarga = e.nextInt();

		while (codCarga <= 0 || codCarga > 30) {
			System.out.println("Digite um código válido");
			codCarga = e.nextInt();

		}

		if (codCarga < 10) {
			precoQ = (cargaT * 1000) * 120;

		} else {
			if (codCarga < 20) {
				precoQ = (cargaT * 1000) * 200;
			} else {
				precoQ = (cargaT * 1000) * 280;
			}
		}

		return precoQ;

	}

	public static double calcularImposto(double precoQ, int codEstado) {

		double precoFinal = 0;

		if (codEstado == 1) {
			precoFinal = precoQ * 1.25;

		} else {
			if (codEstado == 2) {
				precoFinal = precoQ * 1.20;

			} else {
				if (codEstado == 3) {
					precoFinal = precoQ * 1.15;

				} else {
					precoFinal = precoQ;

				}
			}

		}

		return precoFinal;
	}

}

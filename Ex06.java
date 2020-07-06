/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no 
plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula*/

package PacoteJava;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String args []) {
		
		Scanner leitura = new Scanner(System.in);
		
		double x1, x2, y1, y2, potencia1, potencia2, d;
		
		System.out.printf("Escreva o valor de x1: ");
		x1 = leitura.nextDouble();
		
		System.out.printf("Escreva o valor de x2: ");
		x2 = leitura.nextDouble();
		
		System.out.printf("Escreva o valor de y1: ");
		y1 = leitura.nextDouble();
		
		System.out.printf("Escreva o valor de y2: ");
		y2 = leitura.nextDouble();
		
		potencia1 = Math.pow((x2 - x1), 2);
		potencia2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt(potencia1 + potencia2);
		
		System.out.printf("A distância é: %2.2f", d);

	}

}

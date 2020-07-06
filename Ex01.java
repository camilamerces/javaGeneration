/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/ 

package PacoteJava;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int anos, meses, dias, idade_dias;
		
		System.out.printf("Escreva o(s) ano(s): ");
		anos = leitura.nextInt();

		System.out.printf("Escreva o(s) meses(s): ");
		meses = leitura.nextInt();

		System.out.printf("Escreva o(s) dias(s): ");
		dias = leitura.nextInt();
		
		idade_dias = (anos * 365) + (meses * 30) + dias;
		
		System.out.printf("\nO total de dia(s) é %d", idade_dias);
		
	}

}

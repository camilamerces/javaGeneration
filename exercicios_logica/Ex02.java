/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */

package PacoteJava;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		
		System.out.printf("Escreva a idade em dias: ");
		idade = leitura.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		
		System.out.printf("\nA idade é %d ano(s), %d meses(s) e %d dia(s).", anos, meses, dias);
		
	}

}

/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
*/

package arrays;

import java.util.Scanner;

public class Vetor02 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int []vetor = new int [6];
		int soma = 0, contador = 0;
		
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Escreva um número: ");
			vetor[i] = ler.nextInt();
		}
		for(int i = 0; i < vetor.length; i++)
		{	
			if(vetor[i] % 2 == 0)
				soma += vetor[i];
			
			else
			{
				System.out.println("O número " + vetor[i] + " é ímpar.");
				contador++;
			}
		}
		System.out.println("A quantidade de ímpar(es) é " + contador + ".");
		System.out.println("A soma do(s) par(es) é " + soma + ".");
	}
}

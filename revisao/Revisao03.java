/*3- Escrever um programa que leia uma quantidade desconhecida de números e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um número negativo.*/

package revisao;

import java.util.Scanner;

public class Revisao03 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		double numero;
		int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
		
		do
		{
			System.out.println("Escreva um número: ");
			numero = ler.nextDouble();
			
			if(numero >= 0 && numero <= 25)
				contador1++;
			
			else if(numero >= 26 && numero <= 50)
				contador2++;
			
			else if(numero >= 51 && numero <= 75)
				contador3++;
			
			else if(numero >= 76 && numero <= 100)
				contador4++;
		}
		while(numero >= 0);
		
		System.out.println(contador1 + " entre [0-25]\n" + contador2 + " entre [26-50]\n" 
				+ contador3 + " entre [51-75]\n" + contador4+ " entre [76-100]");
	}
}

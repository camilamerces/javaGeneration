/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
*/

package lacos_repeticao;

import java.util.Scanner;

public class Repeticao02 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		int numero, contadorPar = 0, contadorImpar = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Escreva um número: ");
			numero = leitura.nextInt();
			
			if(numero % 2 == 0)
			{
				contadorPar++;
			}
			else
			{
				contadorImpar++;
			}
		}
		System.out.println("Há " + contadorPar + " número(s) par(es).");
		System.out.println("Há " + contadorImpar + " número(s) ímpar(es).");
	}
}

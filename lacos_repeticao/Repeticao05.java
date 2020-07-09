/*5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 No final, mostre a soma dos números digitados.(DO...WHILE)
 */

package lacos_repeticao;

import java.util.Scanner;

public class Repeticao05 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		int numero, soma = 0;
		
		do
		{
			System.out.println("Escreva um número: ");
			numero = leitura.nextInt();
			
			soma+= numero;	
		}
		while (numero != 0);
		
		System.out.println("A soma dos números é " + soma + ".");
	}
}

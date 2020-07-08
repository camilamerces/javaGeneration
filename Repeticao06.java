/*6- Escrever um programa que receba vários números inteiros no teclado. E no final 
 imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package lacos_repeticao;

import java.util.Scanner;

public class Repeticao06 {

	public static void main(String args[])
	{
		
		Scanner leitura = new Scanner(System.in);
		int numero, soma = 0, contador = 0;
		float media = 0;
		
		do
		{
			System.out.println("Escreva um número: ");
			numero = leitura.nextInt();
		
			if(numero % 3 == 0 && numero != 0)
			{
				soma+= numero;
				contador++;
			}	
		}
		while (numero != 0);
	
		if (contador != 0)
		{
			media = soma / contador;
		}
		
		System.out.println("A média dos números é " + media + ".");
	}
}


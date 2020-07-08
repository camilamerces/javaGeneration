/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas 
 com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */

package lacos_repeticao;

import java.util.Scanner;

public class Repeticao03 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		int idade, contador21 = 0, contador50 = 0;
		
		System.out.println("Entre com a idade: ");
		idade = leitura.nextInt();
		
		while (idade != -99)
		{
			if (idade >= 0 && idade < 21)
			{
				contador21++;
			}
			else if (idade > 50)
			{
				contador50++;
			}

			System.out.println("Entre com a idade: ");
			idade = leitura.nextInt();
		}

		System.out.println("O total de pessoas menos de 21 anos é " + contador21 + ".");
		System.out.println("O total de pessoas mais de 50 anos é " + contador50 + ".");
	}
}

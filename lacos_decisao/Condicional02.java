/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

package lacos_decisao;

import java.util.Scanner;

public class Condicional02 {
	
	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		double num1, num2, num3, maior_num, auxiliar = 0;
		System.out.println("Entre com o primeiro número: ");
		num1 = leitura.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leitura.nextDouble();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = leitura.nextDouble();
		
		if (num1 < num2 && num2 < num3)
		{
			
		}
		else if (num1 < num3)
		{
			maior_num = num2;
			
			if (num2 < num3)
			{
				maior_num = num3;
			}
		}
		
		//System.out.printf("O maior número é %d", maior_num);
	}

}

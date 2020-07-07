/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package lacos_decisao;

import java.util.Scanner;

public class Condicional01 {
	
	public static void main(String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int num1, num2, num3, maior_num;
		System.out.println("Entre com o primeiro número: ");
		num1 = leitura.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = leitura.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = leitura.nextInt();
		
		if (num1 >= num2)
		{
			maior_num = num1;
			
			if (maior_num <= num3)
			{
				maior_num = num3;
			}
		}
		else
		{
			maior_num = num2;
			
			if (maior_num <= num3)
			{
				maior_num = num3;
			}
		}
		
		System.out.printf("O maior número é %d.", maior_num);
	}

}

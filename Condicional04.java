/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package lacos_decisao;

import java.util.Scanner;

public class Condicional04 {

	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		double numero, raiz, potencia;
		System.out.println("Entre com o número: ");
		numero = leitura.nextDouble();
		
		if (numero % 2 == 0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O número %.2f é par e sua raiz quadrada é %2.2f.", numero, raiz);
		}
		else
		{
			potencia = Math.pow(numero, 2);
			System.out.printf("O número %.2f é ímpar e sua potência quadrada é %2.2f.", numero, potencia);
		}

	}
}

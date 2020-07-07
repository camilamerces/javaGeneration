/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package lacos_decisao;

import java.util.Scanner;

public class Condicional03 {

	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int idade;
		System.out.println("Escreva a idade da pessoa: ");
		idade = leitura.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Categoria infantil.");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("Categoria juvenil.");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Categoria adulto.");
		}
		else
		{
			System.out.println("Sem categoria definida.");
		}
	}

}

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/

package arrays;

import java.util.Scanner;

public class Matriz03 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int [][]matriz = new int [3][3];
		int contador10 = 0;
		
		for(int linha = 0; linha < matriz.length; linha++)
		{
			for(int coluna = 0; coluna < matriz.length; coluna++)
			{
				System.out.printf("Escreva o número da posição [%d][%d] da matriz: ", linha, coluna);
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] > 10)
				{
					contador10++;
				}
			}
		}
		System.out.println("Há " + contador10 + " número(s) maior(es) que 10.");
	}

}

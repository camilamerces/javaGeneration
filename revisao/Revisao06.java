/*6- Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.*/

package revisao;

import java.util.Scanner;

public class Revisao06 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int []vetor = new int [3];
		int [][]matriz = new int [3][3];
		int []multiplicacao = new int [3];
		
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Escreva o número da posição [%d] do vetor: ", i);
			vetor[i] = ler.nextInt();
		}
		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz.length; j++)
			{
				System.out.printf("Escreva o número da posição [%d][%d] da matriz: ", i, j);
				matriz[i][j] = ler.nextInt();
				
				if(i == 0)
					multiplicacao[i] += (vetor[j] * matriz[i][j]); 
				
				else if(i == 1)
					multiplicacao[i] += (vetor[j] * matriz[i][j]);
		
				else if(i == 2)
					multiplicacao[i] += (vetor[j] * matriz[i][j]);
			}
		}
		
		for(int i = 0; i < multiplicacao.length; i++)
		{
			System.out.printf("\nValor da posição [%d] do vetor é %d.", i, multiplicacao[i]);	
		}
	}
}

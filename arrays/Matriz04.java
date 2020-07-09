/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.
*/

package arrays;

import java.util.Scanner;

public class Matriz04 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int [][]matriz1 = new int [2][2];
		int [][]matriz2 = new int [2][2];
		int escolha;
		
		int [][]matriz3 = new int [3][3];
		int constante = 0;
		
		for(int i = 0; i < matriz1.length; i++)
		{
			for(int j = 0; j < matriz1.length; j++)
			{
				System.out.printf("Número da posição [%d][%d] da 1ª matriz: ", i, j);
				matriz1[i][j] = ler.nextInt();

				System.out.printf("Número da posição [%d][%d] da 2ª matriz: ", i, j);
				matriz2[i][j] = ler.nextInt();
			}
		}
		System.out.printf("\nAgora, escolha uma das opções:");
		System.out.printf("\n" + 
				"(1) somar as duas matrizes\n" + 
				"(2) subtrair a primeira matriz da segunda\n" + 
				"(3) adicionar uma constante as duas matrizes\n" + 
				"(4) imprimir as matrizes\n");
	
		escolha = ler.nextInt();
		if(escolha == 3)
		{
			System.out.printf("\nEscreva o valor da constante: ");
			constante = ler.nextInt();
		}
				
		for(int i = 0; i < matriz1.length; i++)
		{
			for(int j = 0; j < matriz1.length; j++)
			{
				if(escolha == 1)
				{
					matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
					System.out.printf("\nA soma das matrizes na posição [%d][%d] é %d.", i, j, matriz3[i][j]);
				}
	
				else if(escolha == 2)
				{
					matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
					System.out.printf("\nA subtração das matrizes na posição [%d][%d] é %d.", i, j, matriz3[i][j]);
				}
				
				else if(escolha == 3)
				{
					matriz1[i][j] += constante;
					matriz2[i][j] += constante;
					System.out.printf("\nA soma da constante %d na posição [%d][%d] da 1ª matriz é %d, e da 2ª matriz é %d.", 
							constante, i, j, matriz1[i][j], matriz2[i][j]);
				}
				
				else if(escolha == 4)
				{
					System.out.printf("\n1ª matriz[%d][%d] é %d.", i, j, matriz1[i][j]);
					System.out.printf("\n2ª matriz[%d][%d] é %d.", i, j, matriz2[i][j]);
				}
			}
		}
		if(escolha < 1 || escolha > 4)		
			System.out.printf("Escolha inválida!");
	}
}

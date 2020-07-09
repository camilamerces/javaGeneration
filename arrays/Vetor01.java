/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
	A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package arrays;

public class Vetor01 {
	
	public static void main (String args[])
	{
		int []vetor = {1, 0, 5, -2, -5, 7};
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++)
		{
			if(i == 0 || i == 1 || i == 5)
				soma += vetor[i];
			
			else if(i == 4)
				vetor[i] = 100;
			
			System.out.println("O valor da posição [" + i + "] do vetor é " + vetor[i] + ".");
		}
		System.out.println("A soma dos valores das posições [0], [1] e [5] é " + soma + ".");	
	}

}

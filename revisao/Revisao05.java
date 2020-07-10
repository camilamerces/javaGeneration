/*5- Faça um programa que leia um vetor de 5 posições para números reais e, depois, um
código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente
de 1 e 2, escreva uma mensagem informando que o código inválido.*/

package revisao;

import java.util.Scanner;

public class Revisao05 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		double []vetor = new double [5];
		int codigo;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Escreva um número: ");
			vetor[i] = ler.nextDouble();
		}
		
		System.out.println("Digite o código:\n"
				+ "(0)- finaliza o programa\n"
				+ "(1)- mostra o vetor na ordem direta\n"
				+ "(2)- mostra o vetor na ordem inversa.");
		codigo = ler.nextInt();
		
		switch(codigo)
		{
		case 0:
			break;
			
		case 1:
			for(int i = 0; i < vetor.length; i++)
				System.out.printf("|%.1f|", vetor[i]);
			break;
			
		case 2:
			for(int i = (vetor.length - 1); i >= 0; i--)
				System.out.printf("|%.1f|", vetor[i]);
			break;
			
		default:
			System.out.println("Código inválido!");
		}
	}
}

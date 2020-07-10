/*1- Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/

package revisao;

import java.util.Scanner;

public class Revisao01 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		double preco;
		int condicao;
		
		System.out.println("Qual o preço do produto: ");
		preco = ler.nextDouble();
		
		System.out.println("Qual é a forma de pagamento?\n" +  
				"(1) À vista em dinheiro ou cheque, recebe 20% de desconto\n" + 
				"(2) À vista no cartão de crédito, recebe 15% de desconto\n" + 
				"(3) Em duas vezes, preço normal de etiqueta sem juros\n" + 
				"(4) Em três vezes, preço normal de etiqueta mais juros de 10%");
		condicao = ler.nextInt();
		
		switch(condicao)
		{
			case 1:
				preco -= (preco * 0.2);
				break;
				
			case 2:
				preco -= (preco * 0.15);
				break;
				
			case 3:
				//preco = preco;
				break;
				
			case 4:
				preco += (preco * 0.1);
				break;
				
			default:
				System.out.printf("Forma de pagamento inválida!");			
		}
		if(condicao >=1 && condicao <= 4)
			System.out.printf("O preço final do produto é R$ " + preco);
	}
}

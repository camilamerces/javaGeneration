/*4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções 
 (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.
*/

package lacos_repeticao;

import java.util.Scanner;

public class Repeticao04 {
	
	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int numeroPessoas, idade, genero, estado; 
		int pessoasCalmes = 0, calmes18 = 0, femininesNervoses = 0, nervoses40 = 0, masculinesAgressives = 0;
		
		System.out.println("Digite o número de pessoas: ");
		numeroPessoas = leitura.nextInt();
		
		if(numeroPessoas > 0 && numeroPessoas <= 150)
		{
			while (numeroPessoas > 0)
			{
				System.out.println("Digite a idade da pessoa: ");
				idade = leitura.nextInt();
			
				System.out.println("Digite o gênero da pessoa (1- feminine / 2- masculine): ");
				genero = leitura.nextInt();
	
				System.out.println("Digite o estado da pessoa (1- calme / 2- nervose / 3- agressive): ");
				estado = leitura.nextInt();
				
				if(estado == 1)
				{
					pessoasCalmes++;
					if(idade < 18)
					{
						calmes18++;
					}
				}
				else if(estado == 2)
				{
					if(genero == 1)
					{
						femininesNervoses++;
					}
					if(idade > 40)
					{
						nervoses40++;
					}
				}
				else if(estado == 3)
				{
					if(genero == 2)
					{
						masculinesAgressives++;
					}	
				}
				numeroPessoas--;
			}
			System.out.println("O número de pessoas calmas é " + pessoasCalmes + "."); 
			System.out.println("O número de mulheres nervosas é " + femininesNervoses + ".");
			System.out.println("O número de homens agressivos é " + masculinesAgressives + "."); 
			System.out.println("O número de pessoas nervosas com mais de 40 anos é " + nervoses40 + "."); 
			System.out.println("O número de pessoas calmas com menos de 18 anos é " + calmes18 + ".");
		}
		
		else
		{
			System.out.println("O número de pessoas deve ser entre 0 e 150."); 
		}
	}
}

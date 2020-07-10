/*4- Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3
+ 7/4 + ... + 99/50
*/

package revisao;

public class Revisao04 {
	
	public static void main (String args[])
	{
		double numerador = 1, denominador = 1, soma = 0;
		
		while(numerador <= 99 && denominador <= 50)
		{
			//System.out.println(numerador / denominador);
			soma += (numerador / denominador);
			numerador += 2;
			denominador++;
		}
		System.out.printf("A soma é %.2f.", soma);
	}
}

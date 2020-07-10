/*2- O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para
dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição
de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso
*/

package revisao;

import java.util.Scanner;

public class Revisao02 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Digite seu peso em kg: ");
		peso = ler.nextDouble();
		System.out.println("Digite sua altura em m: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5)
			System.out.printf("Seu IMC é %2.2f. \nMenor que 18,5: Abaixo do peso.", imc);
		
		else if(imc >= 18.5 && imc < 25)
			System.out.printf("Seu IMC é %2.2f. \nEntre 18,5 e 25: Peso normal.", imc);
		
		else if(imc > 25 && imc <= 30)
			System.out.printf("Seu IMC é %2.2f. \nEntre 25 e 30: Acima do peso.", imc);
		
		else if(imc > 30)
			System.out.printf("Seu IMC é %2.2f. \nMaior que 30: Obeso.", imc);
	}
}

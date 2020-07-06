/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor
 *  e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */

package PacoteJava;

import java.util.Scanner;

public class Ex08 {
	
	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		double custo_fabrica, percentagem_distribuidor, impostos, custo_consumidor;
		
		System.out.printf("Digite o valor de fábrica do carro: ");
		custo_fabrica = leitura.nextFloat();
		
		percentagem_distribuidor = custo_fabrica * 0.28;
		impostos = custo_fabrica * 0.45;
		
		custo_consumidor = (custo_fabrica + percentagem_distribuidor + impostos);
		
		System.out.printf("O custo para o consumidor é %2.2f ", custo_consumidor);
		
	}

}

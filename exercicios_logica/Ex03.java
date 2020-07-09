/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e 
 * mostre-o expresso em horas, minutos e segundos. 
 */

package PacoteJava;

import java.util.Scanner;

public class Ex03 {
	
	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		
		int entrada_seg, segundos, minutos, horas;
		
		System.out.printf("Escreva o tempo do evento em segundos: ");
		entrada_seg = leitura.nextInt();
		
		horas = entrada_seg / 3600;
		minutos = (entrada_seg % 3600) / 60;
		segundos = (entrada_seg % 3600) % 60;
		
		System.out.printf("\nO evento durou %d hora(s), %d minuto(s) e %d segundo(s).", horas, minutos, segundos);
	}

}

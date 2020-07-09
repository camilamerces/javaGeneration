/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
 * e calcule a seguinte expressão: D = (R+S)/2, onde R = (A+B)² e S = (B+C)² */

package PacoteJava;

import java.util.Scanner;

public class Ex04 {
	
	public static void main (String args[])
	{
		int a, b, c, r, s;
		float d;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.printf("Escreva o valor de A: ");
		a = leitura.nextInt();
		
		System.out.printf("Escreva o valor de B: ");
		b = leitura.nextInt();
		
		System.out.printf("Escreva o valor de C: ");
		c = leitura.nextInt();
		
		r = (int) Math.pow(a + b, 2);
		s = (int) Math.pow(b + c, 2);
		
		d = (r + s) / 2;
		
		System.out.printf("\nO resultado é %.2f", d);
		
	}
}

/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 */

package PacoteJava;

import java.util.Scanner;

public class Ex07 {
	
	public static void main (String args[])
	{
				
		Scanner leitura = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		
		System.out.printf("Escreva o valor de a: ");
		a = leitura.nextFloat();
		
		System.out.printf("Escreva o valor de b: ");
		b = leitura.nextInt();
		
		System.out.printf("Escreva o valor de c: ");
		c = leitura.nextFloat();
		
		System.out.printf("Escreva o valor de d: ");
		d = leitura.nextFloat();
		
		System.out.printf("Escreva o valor de e: ");
		e = leitura.nextFloat();
		
		System.out.printf("Escreva o valor de f: ");
		f = leitura.nextFloat();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.printf("\nO resultado de x é %2.2f e resultado de y é %2.2f", x, y);

	}

}

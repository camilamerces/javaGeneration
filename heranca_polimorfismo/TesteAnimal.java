/*Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
*/

package heranca_polimorfismo;

import java.util.Scanner;

public class TesteAnimal {
	
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha o animal: \n" +
							"(1) Cachorro\n (2)Cavalo\n (3) Preguiça\n");
		int escolha = ler.nextInt();
		
		switch(escolha)
		{
			case 1: animal = cachorro; break;
			case 2: animal = cavalo; break;
			case 3: animal = preguica; break;
			default: System.out.println("Não é um animal!");
		}
		
		if(escolha >= 1 && escolha <= 3)
		{
			animal.emitirSom();
			animal.acao();
		}   
	}
}

package heranca_polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("Bela", 5);
	}
	
	public void emitirSom()
	{
		System.out.println("Au au");
	}
	
	public void acao()
	{
		System.out.println("Correr!");
	}
}

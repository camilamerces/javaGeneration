package heranca_polimorfismo;

public class Preguica extends Animal {
	
	public Preguica()
	{
		super("Caranga", 5);
	}
	
	public void emitirSom()
	{
		System.out.println("zzzZZzzzzzZz");
	}
	
	public void acao()
	{
		System.out.println("Subir em árvores!");
	}
}


package heranca_polimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo()
	{
		super("Carol", 25);
	}
	
	public void emitirSom()
	{
		System.out.println("Pocotó pocotó");
	}
	
	public void acao()
	{
		System.out.println("Correr!");
	}
}

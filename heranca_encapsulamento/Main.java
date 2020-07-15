package heranca_encapsulamento;

public class Main {
	public static void main(String args[])
	{
		/*Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Bruna");
		pessoa1.setEndereco("Rua dos Bobos");
		pessoa1.setTelefone("9990-9990");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getTelefone());*/
		
		Pessoa pessoa2 = new Pessoa("Carol", "SP", "9999");
		Pessoa pessoa4 = new Pessoa("Bianca", "Rua");
		Pessoa pessoa3 = new Pessoa("SP");
		
		
	}

}

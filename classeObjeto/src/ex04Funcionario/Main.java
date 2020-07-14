package ex04Funcionario;

public class Main {
	
	public static void main(String args[])
	{
		Funcionario funcionario1 = new Funcionario("Paula", 50, true);
		Funcionario funcionario2 = new Funcionario("Camila", 60, false);
		Funcionario funcionario3 = new Funcionario("Carol", 30, true);
		
		System.out.println(funcionario1.mostrarInformacao());
		funcionario1.verificarFolga();
		
		System.out.println(funcionario2.mostrarInformacao());
		funcionario2.verificarFolga();
		
		System.out.println(funcionario3.mostrarInformacao());
		funcionario2.verificarFolga();
	}
}

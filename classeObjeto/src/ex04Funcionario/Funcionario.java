package ex04Funcionario;

public class Funcionario {

	private String nomeFuncionario;
	private double horasFuncionario;
	private double salarioFuncionario = 30;
	private boolean folgaFuncionario;
		
	public Funcionario(String nome, double horas, boolean folga)
	{
		nomeFuncionario = nome;
		horasFuncionario = horas;
		folgaFuncionario = folga;
	}
	
	public String mostrarInformacao()
	{
		double salarioFinal = salarioFuncionario * horasFuncionario;
		String informacao = "A funcionária " + nomeFuncionario + 
				" trabalhou " + horasFuncionario + 
				" horas. Portanto vai receber R$" + salarioFinal;
		return informacao;
	}
		
	public void verificarFolga() 
	{
		if(folgaFuncionario && horasFuncionario >= 40)
		System.out.println("A funcionária tem direito à folga.\n");
		
		else
			System.out.println("A funcionária não tem direito à folga.\n");
	}
}

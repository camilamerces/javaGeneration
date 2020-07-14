package ex02Aviao;

public class Aviao {
	
	private String nomeCompanhia;
	private int codigoVoo;
	private boolean embarqueVoo;
		
	public Aviao(String nome, int codigo, boolean embarque)
	{
		nomeCompanhia = nome;
		codigoVoo = codigo;
		embarqueVoo = embarque;
	}
	
	public String mostrarInformacao()
	{
		String informacao = "Nome da companhia aérea: " + nomeCompanhia + 
		"\nCódigo do voo: " + codigoVoo;
		return informacao;
	}
		
	public void verificarEmbarque() 
	{
		if(embarqueVoo)
			System.out.println("O avião está pronto para embarque.\n");
		else
			System.out.println("O embarque desse avião vai atrasar.\n");
	}
}


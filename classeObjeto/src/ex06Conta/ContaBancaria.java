package ex06Conta;

public class ContaBancaria {
	
	private String nomeConta;
	private int numeroConta;
    private int agenciaConta;
	private double saldoConta;
	private double valorDeposito;
	private double valorSaque;
	
	public ContaBancaria(String nome, int numero, int agencia, double saldo)
	{
		nomeConta = nome;
		numeroConta = numero;
		agenciaConta = agencia;
		saldoConta = saldo;
	}
	
	public String mostrarInformacao()
	{
		return ("Nome: " + nomeConta +
				"\nNúmero: " + numeroConta +
				"\nAgência: " + agenciaConta +
				"\nSaldo: " + saldoConta);
	}
	
	public String Saque(double saque)
	{
		valorSaque = saldoConta - saque;
		saldoConta = valorSaque;
		String saldo = ("Valor após o saque é R$ " + saldoConta );
		return saldo;
	}
	
	public String Deposito(double deposito)
	{
		valorDeposito = saldoConta + deposito;
		saldoConta = valorDeposito;
		String saldo = ("Valor após o deposito é R$ " +  saldoConta + "\n");
		return saldo;
	}

}

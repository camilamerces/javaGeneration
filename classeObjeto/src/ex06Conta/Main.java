package ex06Conta;

public class Main {
	
	public static void main (String args[])
	{
		ContaBancaria conta1 = new ContaBancaria("Joana", 123456, 12, 500);
		ContaBancaria conta2 = new ContaBancaria("Carla", 987456, 14, 1000);
		
		System.out.println(conta1.mostrarInformacao());
		System.out.println(conta1.Saque(100));
		System.out.println(conta1.Deposito(200));
		
		System.out.println(conta2.mostrarInformacao());
		System.out.println(conta2.Saque(200));
		System.out.println(conta2.Deposito(150));
	}

}

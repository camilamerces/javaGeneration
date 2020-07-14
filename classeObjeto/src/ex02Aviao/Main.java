package ex02Aviao;

public class Main {
	
	public static void main (String args[])
	{
		Aviao aviao1 = new Aviao("Latam", 5067, true);
		Aviao aviao2 = new Aviao("Gol", 1003, false);
		Aviao aviao3 = new Aviao("Avianca", 2356, true);
		
		System.out.println(aviao1.mostrarInformacao());
		aviao1.verificarEmbarque();
		
		System.out.println(aviao2.mostrarInformacao());
		aviao2.verificarEmbarque();
		
		System.out.println(aviao3.mostrarInformacao());
		aviao3.verificarEmbarque();
	}

}

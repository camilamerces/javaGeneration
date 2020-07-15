/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe 
 * Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
 *  salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com 
 *  métodos seletores e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. 
 */

package heranca_encapsulamento;

public class Empregado extends Pessoa {
	
	private int codigoSetor; 
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public String calcularSalario()
	{
		System.out.println("Salário base: " + salarioBase);
		System.out.println("Imposto: " + imposto);
		String salario = "Seu salário é " + (salarioBase - imposto); 
		return salario;
	}
	
	public String mostrarInformacao()
	{
		String informacao = "Nome: " + nome + 
				"\nEndereço: " + endereco + 
				"\nTelefone: " + telefone;
		return informacao;
	}
}

/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters)
 *  e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de 
 * construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
 */

package heranca_encapsulamento;

public class Pessoa {
	//atributos
	protected String nome;
	protected String endereco; 
	protected String telefone;
	
	//getters e setters
	/*public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	
	}*/
	
	//construtor padrão
	public Pessoa(String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//outro construtor
	public Pessoa(String nome, String endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//outro construtor
	public Pessoa(String endereco)
	{
		this.endereco = endereco;
		if(endereco == "SP")
			System.out.println("Você é de SP.");
	}
}

package Aluno;

public class Aluno {
	
	private String nome;
	private String endereco;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return nome;
	}
	
	// Endereço
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	// Bairro
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	// CEP
	
	public void setCEP(long cep) {
		this.cep = cep;
	}
	
	public long getCEP() {
		return cep;
	}
	
	// Cidade
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	// Estado
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
}

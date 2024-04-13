package app08;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String no, int id, String se) {
		this.setNome(no);
		this.setIdade(id);
		this.setSexo(se);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade += idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public void fazerAniver() {
		this.setIdade(1);
	}
}

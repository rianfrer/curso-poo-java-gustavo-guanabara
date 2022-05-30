package Aula10;

public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//M�todos
	public void fazerAniv() {
		this.idade++;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + 
			    ", sexo=" + sexo + "]";
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
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}

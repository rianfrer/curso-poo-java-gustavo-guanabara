package Aula11;

public class Aluno extends Pessoa{

	//Heran?a para Diferen?a (heran?a rica)
	//Atributos 
	private int matr;
	private String curso;
	
	public void pagarMens() {
		System.out.println("Pagando mensalidade do(a) aluno " + this.getNome());
	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}

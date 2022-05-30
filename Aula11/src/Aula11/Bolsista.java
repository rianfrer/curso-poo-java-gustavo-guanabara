package Aula11;

public class Bolsista extends Aluno{

	//Atributos
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMens() {
		System.out.println(this.getNome() + " � bolsista! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}

package Aula12;
public class Aula12 {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(40.7f);
		m.setCorPelo("Preto");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara arara = new Arara();
		
		canguru.locomover();
		t.locomover();
		cobra.locomover();
	}

}

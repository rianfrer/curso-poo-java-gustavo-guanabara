package Aula13;
public class Aula13 {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		Lobo l = new Lobo();
		
		c.emitirSom();
		l.emitirSom();
		
		c.reagir("Ol�");
		c.reagir("Corre");
		c.reagir(false);
	}

}

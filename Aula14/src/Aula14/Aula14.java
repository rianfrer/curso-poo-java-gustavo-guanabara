package Aula14;
public class Aula14 {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula POO");
		v[1] = new Video("POLIMORFISMO");
		v[2] = new Video("HERAN?A");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Ana", 24, "F", "duca");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		Vizualizacao vizu[] = new Vizualizacao[5];
		vizu[0] = new Vizualizacao(g[0], v[2]);
		vizu[0].avaliar();
		System.out.println(vizu[0].toString());
		
		vizu[1] = new Vizualizacao(g[0], v[1]);
		vizu[0].avaliar(85.0f);
		System.out.println(vizu[0].toString());
	}

}

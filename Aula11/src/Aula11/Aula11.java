package Aula11;
public class Aula11 {

	public static void main(String[] args) {

		/*Pessoa p1 = new Pessoa(); [ERRO] A classe pessoa n�o pode ser 
		instanciada pq � uma classe abstrata*/
		
		Visitante v1 = new Visitante(); //Visitante � filha de pessoa mas isso n o torna abstrata tbm
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();  // Mesmo caso de visitante
		a1.setNome("Cl�udio");
		a1.setMatr(1111);
		a1.setCurso("ADS");		
		a1.setIdade(18);
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMens();
		
		
		Bolsista b1 = new Bolsista();
		b1.setMatr(1112);
		b1.setNome("Jo�o");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		System.out.println(b1.toString());
		b1.pagarMens();
		
		Professor p1 = new Professor();
		p1.setNome("Alisson");
		p1.setIdade(47);
		p1.setSexo("M");
		System.out.println(p1.toString());
		p1.setSalario(1500f);
		p1.receberAum(450.80f);
		
		
	}

}

package Aula10;
public class Aula10 {

	public static void main(String[] args) {		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cla?dio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Inform?tica");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		/*p1.receberAum(550.20);
		p2.mudatTrab();
		p4.cancelarMatr();*/
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
 	}

}

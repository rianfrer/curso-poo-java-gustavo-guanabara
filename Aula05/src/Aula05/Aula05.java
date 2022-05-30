package Aula05;
public class Aula05 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Joao");
		p1.abrirConta("cc");
		p1.depositar(300);
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Maria");
		p2.abrirConta("cp");
		p2.depositar(500);
		p2.sacar(100);
		p2.estadoAtual();
	}

}
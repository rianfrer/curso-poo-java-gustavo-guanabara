package Aula07;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// M?todos
	public Luta() {

	}

	public void marcarLuta(Lutador L1, Lutador L2) {
		if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2) {
			this.setAprovada(true);
			this.setDesafiado(L1);
			this.setDesafiante(L2);
		} else {
			this.setAprovada(false);
			System.out.println("Imposs?vel marcar luta!!");
		}
	}

	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
			case 0:
				System.out.println("Empate");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println(this.getDesafiado().getNome() + " WIN");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:
				System.out.println(this.getDesafiante().getNome() + " WIN");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}

		} else {
			System.out.println("A luta n?o pode acontecer!!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}

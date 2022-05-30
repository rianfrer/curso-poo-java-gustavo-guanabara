package Aula06;
public class ControleRemoto implements Controlador {
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos Especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	private int getVolume() {
		return this.volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private boolean getLigado() {
		return this.ligado;
	}
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private boolean getTocando() {
		return this.tocando;
	}
	private void setTocando(boolean t) {
		this.tocando = t;
	}

	// Métodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("----- MENU -----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i+=10 ) {
			System.out.println("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if(getLigado()) {
			this.setVolume(getVolume() + 1);
		}else {
			System.out.println("Impossível aumentar volume!!");
		}
	}

	@Override
	public void menosVolume() {
		if(getLigado()) {
			this.setVolume(getVolume() - 1);
		}else {
			System.out.println("Impossível dimunuir volume!!");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {}
		System.out.println("Não consegui reproduzir!!");
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
	}
	
	
}
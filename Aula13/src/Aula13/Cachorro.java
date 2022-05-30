package Aula13;
public class Cachorro extends Lobo{

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au!");
	}
	
	public void reagir(String frase) {
		if(frase == "Ol�" || frase == "Bom dia") {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar rabo");
		}else if(hora >= 18) {
			System.out.println("Latir");
		}else {
			System.out.println("Ignorar");
		}
	}

	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Latir");
		}
		
	}

	public void reagir(int idade, float peso) {
		if(idade < 10 && peso < 20) {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Ignorar");
		}
	}
	
}

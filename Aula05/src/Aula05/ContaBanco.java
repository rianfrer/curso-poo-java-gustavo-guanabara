package Aula05;

public class ContaBanco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;  
	private float saldo;
	private boolean status;
	
	//Métodos Especiais 
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	//Métodos
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(this.tipo == "cc") {
			this.setSaldo(50);
		}else { 
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.saldo == 0) {
			setStatus(false);
			System.out.println("Fechada com sucesso");
		}else {
			System.out.println("Não é possível fechar a conta!!");
		}
	}
	
	public void depositar(float valor) {
		if(this.status == true) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Inpossível depositar!!");
		}
		
	}
	
	public void sacar(float valor) {
		if(this.status == true) {
			if(this.saldo >= valor) {
				setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente!!");
			}
		}else {
			System.out.println("Impossível fazer saque de uma conta fechada!!");
		}
		
	}
	
	public void pagarMensal() {
		int mensalidade;
		if(this.tipo == "cc") {
			mensalidade = 12;
		}else {
			mensalidade = 20;
		}
		
		if(this.status = true) {
			if(this.saldo > 0 ) {
				setSaldo(getSaldo() - mensalidade);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente!!");
			}
		}else {
			System.out.println("Impossível pagar!!");
		}
	}
	
	public void estadoAtual() {
		System.out.println("-------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
}
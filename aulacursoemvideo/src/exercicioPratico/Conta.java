package exercicioPratico;

public class Conta {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estatusConta() {
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		System.out.println("---------------------------------------------------");
	}
	
	//Métodos Especial (construtor)
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);		
	}
	//Métodos especiais
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.setSaldo(50);
		}else if (t =="CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberto com sucesso!");
	}
	public void fecharConta() {
		if (this.getStatus()==true) {
			if (this.getSaldo()==0){
				this.setStatus(false);
			}else {
				System.out.println("Conta com saldo ou debito!");
			}
		}else {
			System.out.println("Conta inexistente!");
		}
		System.out.println("Conta fechada com sucesso!");
	}
	public void depositar(double v) {
		if (this.getStatus()==true){
			this.setSaldo(this.getSaldo()+ v);
			System.out.println("Deposito efetuado com sucesso Sr "+this.getDono());
		}else {
			System.out.println("Impossivel depositar! Conta inexistente!");
		}
		
	}
	public void sacar(double v) {
		if (this.getStatus()==true){
			if (this.getSaldo() >= v){
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado Sr "+this.getDono());
			}else {
				System.out.println("Saldo Insuficiente!");
			}
		}else {
			System.out.println("Impossivel sacar!");
		}
		
	}
	public void pagarMensal() {
		if (this.getTipo()=="CC") {
		double v = 12;
		this.setSaldo(this.getSaldo()-v);
		}else if (getTipo()=="CP") {
			double v = 20;
			this.setSaldo(this.getSaldo()-v);
		}
	}
	
	//getters e setters
	public int getNumConta(){
		return this.numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;		
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono (String d) {
		this.dono=d;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double s) {
		this.saldo=s;
	}
	public boolean getStatus() {
		return this.status;
	}
	public boolean setStatus(boolean st) {
		return this.status=st;
	}

}

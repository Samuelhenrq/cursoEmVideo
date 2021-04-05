package aula03;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, float p , String c ){
		this.setModelo(m);
		this.setPonta(p);	
		this.setCor(c);
		this.tampar();
		
	}
	
	public void status() {
		System.out.println("SOBRE CANETA");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.getCor());
		System.out.println("Tampada: "+this.tampada);
	}
	
	public void tampar() {
		tampada = true;
	}
	public void destampar() {
		tampada = false;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta=p;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor=c;
	}
	public boolean getTampada(){
		return this.tampada;
	}
	public void setTampada(boolean t) {
		this.tampada=t;
	}


}

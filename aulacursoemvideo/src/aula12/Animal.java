package aula12;

public abstract class Animal {
	
	//Atributos
	private double peso;
	private int idade;
	private int membros;
	
	//Métodos de animais
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public double getPeso() {
		return this.peso;
	}
	public void serPeso(double p) {
		this.peso = p;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	

}

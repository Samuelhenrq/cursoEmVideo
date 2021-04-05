package aulaHerança;

public abstract class Pessoa {
	
	//Atributo
	private String nome;
	private int idade;
	private String sexo;
	
	
	//Metodo
	public void fazerAnirv() {
		this.setIdade(this.getIdade() + 1); 
		
	}
	
	//Metodo especial
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int i){
		this.idade = i;		
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	

}

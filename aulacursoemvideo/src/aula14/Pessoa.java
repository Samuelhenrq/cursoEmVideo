package aula14;

public class Pessoa {
	
	//Atributo
	protected String nome;
	protected int idade;
	protected String sexo;
	protected String experiencia;
	
	//Construtor
	public Pessoa(String nome, int idade, String sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		
	}
	
	//Metodos
	public void ganharExp() {
		
	}
	
	//Metodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
	public String getExperiencia() {
		return this.experiencia;
	}
	public void setExperiencia(String e) {
		this.experiencia = e;
	}

	@Override
	public String toString() {
		return "Pessoa\n Nome: " + nome + "\nIdade=" + idade + "\nSexo=" + sexo + "\nExperiencia=" + experiencia ;
	}
	
	
	
}

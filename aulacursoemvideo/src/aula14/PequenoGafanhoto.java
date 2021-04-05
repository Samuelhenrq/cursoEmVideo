package aula14;

public class PequenoGafanhoto extends Pessoa{
	
	//Atributo
	private int login;
	private int totAssistido;
	
	
	
	public PequenoGafanhoto(String nome, int idade, String sexo, int login) {
		super(nome, idade, sexo);
		this.login = login;
	}

	//Metodo
	public void viuMaisUm() {
		
	}
	
	//Metodo Especiais
	public int getLogin() {
		return this.login;
	}
	public void setLogin(int l) {
		this.login = l;
	}
	public int getTotAssistido() {
		return this.totAssistido;
	}
	public void setTotAssistido(int t) {
		this.totAssistido = t;
	}

	@Override
	public String toString() {
		return "PequenoGafanhoto \n"+super.toString() +"Login: "+ login + "\nTotal Assistido: " + totAssistido;
	}

	

	
	
	

}

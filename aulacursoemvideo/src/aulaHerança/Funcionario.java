package aulaHerança;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String s) {
		this.setor = s;
	}
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	public void setTrabalhando(boolean t) {
		this.trabalhando = t;
	}

}

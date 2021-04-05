package aulaHerança;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno "+this.getNome());
	}
	public void cancelarMatr() {
		System.out.println("Cancelar matricula!");
		
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int m) {
		this.matricula = m;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}
	

}

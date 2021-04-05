package aulaHerança;

public class Bolsistas extends Aluno{
	
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println(this.getNome()+" renovou a bolsa!");
	}
	
	/*Repare que essa classe é estendia de aluno(que é estendida de pessoa)
	  na classe aluno tem o metodo pagarmensalidade e nessa classe estamos sobrepondo o metodo da classe aluno*/
	public void pagarMensalidade() {
		System.out.println(this.getNome()+ " é bolsista! Pagamento insento.");
	}
	
	public double getBolsa() {
		return this.bolsa;
	}
	public void setBolsa(double b) {
		this.bolsa = b;
	}
	

}

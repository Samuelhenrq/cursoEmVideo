package aulaHeran�a;

public class Bolsistas extends Aluno{
	
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println(this.getNome()+" renovou a bolsa!");
	}
	
	/*Repare que essa classe � estendia de aluno(que � estendida de pessoa)
	  na classe aluno tem o metodo pagarmensalidade e nessa classe estamos sobrepondo o metodo da classe aluno*/
	public void pagarMensalidade() {
		System.out.println(this.getNome()+ " � bolsista! Pagamento insento.");
	}
	
	public double getBolsa() {
		return this.bolsa;
	}
	public void setBolsa(double b) {
		this.bolsa = b;
	}
	

}

package aulaHeran�a;

//quando a classe tem final ela n�o pode se estender em outra classe !!
public final class Professor extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	//Quando se tem final o metodo n�o pode ser sobreposto
	public final void receberAum(double aum) {
		this.setSalario(this.getSalario() + aum);
		
	}
	
	public String getEspecialidade(){
		return this.especialidade;
	}
	public void setEspecialidade(String e) {
		this.especialidade = e;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double s) {
		this.salario = s;
	}

}

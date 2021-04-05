package aula02;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	void status() {             /*status() é um metodo*/
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor caneta: "+ this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Está tampada: "+ this.tampada);
	}
	void rabicar() {           /*rabiscar() é um metodo*/
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar!!");
		}else {
			System.out.println("Estou rabiscando");
		}
		
	}
	void tampar() {           /*tampar() é um metodo*/
		this.tampada = true;
		
	}
	void destampar() {        /*destampar() é um metodo*/
		this.tampada = false;
		
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carga;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + Float.floatToIntBits(ponta);
		result = prime * result + (tampada ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caneta other = (Caneta) obj;
		if (carga != other.carga)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (Float.floatToIntBits(ponta) != Float.floatToIntBits(other.ponta))
			return false;
		if (tampada != other.tampada)
			return false;
		return true;
	}
	
	

}

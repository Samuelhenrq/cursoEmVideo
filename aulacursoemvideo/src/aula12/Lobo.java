package aula12;

public class Lobo extends Cachorro{
	
	
	//Sobrepor ou seja polimorfismo de sobreposi��o      (mesmo metodo que classe cachorro, so que saida diferentes)
	@Override
	public void alimentar() {
		System.out.println("Comendo Ca�a");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuuuuu!");
		
	}

}

package aula12;

public class Aula12Poli {
	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Cachorro c = new Cachorro();
		Lobo l = new Lobo();
		
		c.emitirSom();
		c.reagir("Olá");
		c.reagir(false);
		
	}

}

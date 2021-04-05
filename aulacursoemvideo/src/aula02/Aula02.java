package aula02;

public class Aula02 {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta(); /*Intanciei a classe primeiro, c1 é o objeto*/
		c1.setModelo("Bic");
		c1.setCor("Azul"); 
		c1.setPonta(0.5f);
		c1.setCarga(90);
		
		c1.destampar();
		c1.rabicar();
		c1.status();
		
		System.out.println("-----------------------");
		
		Caneta c2 = new Caneta();
		c2.setModelo("Compactor economic");
		c2.setCor("Preta");
		c2.setPonta(0.9f);
		c2.setCarga(63);
		
		c2.tampar();
		c2.rabicar();
		c2.status();
		
	}

}

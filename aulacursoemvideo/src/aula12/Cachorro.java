package aula12;

public class Cachorro extends Animal{

	//Polimorfismo de sobrecargar   é o mesmo nome de metodo repetido na mesma classe e com assinaturas diferentes
	public void reagir(String frase) {
		if(frase.equals("toma comida") || frase.equals("Olá")) {
			System.out.println("Abanar rabo e latir");
		}else {
			System.out.println("Rosnar");
		}
	}
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar rabo");
		}else if (hora >= 18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar  rabo e latir");
		}
		
	}
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("Abanar rabo");
		}else {
			System.out.println("Rosnar e latir");
		}
	}
	public void reagir(int idade, double peso) {
		if(idade<5) {
			if(peso<10) {
				System.out.println("Abanar rabo");
			}else {
				System.out.println("Latir");
			}
		}else {
			if(peso<10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}
	}
		
	@Override
	public void locomover() {
		System.out.println("Correr");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo ração");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au au au!");
		
	}
	
	

	
	

}

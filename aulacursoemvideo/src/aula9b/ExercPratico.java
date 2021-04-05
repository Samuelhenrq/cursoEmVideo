package aula9b;

public class ExercPratico {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro Alves Cabral", 22, "Masculino");
		p[1] = new Pessoa("Maria Joaquina da Penha", 25, "Feminino");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Livro("Java avançado","Maria Candido",800,p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		System.out.println(l[0].detalhes());
		
		System.out.println(l[1].detalhes());
	
	}
}

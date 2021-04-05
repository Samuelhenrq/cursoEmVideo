package aulaHerança;

public class ProjetoPessoas {
	public static void main(String[] args) {
		
		Bolsistas p1 = new Bolsistas();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("João");
		p4.setNome("Claudia");
		
		p1.setIdade(22);
		p2.setIdade(24);
		p3.setIdade(43);
		p4.setIdade(36);
		
		p1.setSexo("M");
		p4.setSexo("F");
		
		p2.setCurso("Informatica");
		p3.setEspecialidade("Doutorado");
		p4.setSetor("Secretaria");
		
		p1.pagarMensalidade();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}

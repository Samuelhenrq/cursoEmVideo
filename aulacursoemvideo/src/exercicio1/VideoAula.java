package exercicio1;

public class VideoAula {
	public static void main(String[] args) {
		
		Video v1 = new Video();
		
		v1.setNomeAula("Orientação a objeto");
		v1.setProfessor("Gustavo Guanabara");
		v1.setDuracao(20.37);
		
		v1.pause();
		v1.estudando();
		v1.status();
		
	}

}

package aula14;

public class ProjetoYouTube {
	public static void main(String[] args) {
		
		//Criei um vetor de objetos
		Video v[] = new Video[3];
		
		v[0]= new Video("Aula Java");
		v[1]= new Video("Aula PHP");
		v[2]= new Video("Aula HTTP");
		
		Pessoa p[] = new Pessoa[2];
		
		p[0]= new Pessoa("Ezequiel Gomes", 25, "M");
		p[1]= new Pessoa("Jessica Danielly", 23, "F");
		
		PequenoGafanhoto g[] = new PequenoGafanhoto[3];
		
		g[0]= new PequenoGafanhoto("Samuel Henrique", 27, "M", 1262491);
		g[1]= new PequenoGafanhoto("Daniela Sá", 26, "F", 156546);
		g[2]= new PequenoGafanhoto("Gustavo Guanabara", 45,"M", 354653);
		
		Visualizacao vis[] = new Visualizacao[2];
		
		vis[0]= new Visualizacao(g[0], v[2]);
		vis[0].avaliar(95);
		System.out.println(vis[0].toString());
		vis[1]= new Visualizacao(g[1], v[2]);
		System.out.println(vis[1].toString());
		
		
		
		/*System.out.println(p[0].toString());
		System.out.println("-------------------------");
		System.out.println(g[0].toString());
		System.out.println("-------------------------");
		System.out.println(v[1].toString());*/
		
		
		
		
	}

}

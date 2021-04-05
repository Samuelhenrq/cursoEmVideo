package aula9b;

public class Livro implements Publicacao{
	
	//Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	//Metodo
	public String detalhes() {
		return "###LIVRO### \nTitulo: " + titulo + "\nAutor: " + autor + "\nTotal de Paginas: " + totPaginas + "\nPagina Atual: " + pagAtual
				+ "\nAberto: " + aberto + "\nLeitor: " + leitor.getNome();
	}
		
	//Metodos especiais
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String a) {
		this.autor = a;
	}
	public int getTotPaginas() {
		return this.totPaginas;
	}
	public void setTotPaginas(int p) {
		this.totPaginas = p;
	}
	public int getPagAtual() {
		return this.pagAtual;
	}
	public void setPagAtual(int pa) {
		this.pagAtual = pa;
	}
	public boolean getAberto() {
		return this.aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return this.leitor;
	}
	public void setLeitor(Pessoa l) {
		this.leitor = l;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(int p) {
		if(p <= this.getTotPaginas()){
			this.pagAtual = p;
		}else {
			this.pagAtual = 0;
		}
		
		
	}

	@Override
	public void avancarPag() {
		this.setPagAtual(getPagAtual() + 1);
		
	}

	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual() - 1);
		
	}
	

}

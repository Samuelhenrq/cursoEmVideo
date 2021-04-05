package aula14;

public class Video implements AcoesVideo{
	
	//Atributo
	private String titulo;
	private double avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public double getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(double a) {
		int nova;
		nova =(int) (getAvaliacao()+avaliacao)/this.getViews();
		this.avaliacao = nova;
	}
	public int getViews() {
		return this.views;
	}
	public void setViews(int v) {
		this.views = v;
	}
	public int getCurtidas() {
		return this.curtidas;
	}
	public void setCurtidas(int c) {
		this.curtidas = c;
	}
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	public void setReproduzindo(boolean r) {
		this.reproduzindo = r;
	}
	@Override
	public void play() {
		this.setReproduzindo(true);
			
		
		
	}
	@Override
	public void pause() {
		this.setReproduzindo(false);
		
	}
	@Override
	public void like() {
		this.setCurtidas(getCurtidas()+1);
		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	

}

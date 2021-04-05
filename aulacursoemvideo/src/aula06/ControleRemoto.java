package aula06;

public class ControleRemoto implements Controlador {
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Metodos Especiais (Controlador)
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int v) {
		this.volume = v;
	}

	public boolean getLigado() {
		return this.ligado;
	}

	public void setLigado(boolean l) {
		this.ligado = l;
	}

	public boolean getTocando() {
		return this.tocando;
	}

	public void setTocando(boolean t) {
		this.tocando = t;
	}

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);

	}

	@Override
	public void abrirMenu() {
		System.out.println("-----Menu-----");
		System.out.println("Esta ligado? "+this.getLigado());
		System.out.println("Está tocando? "+this.getTocando());
		System.out.println("Volume: "+this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("| ");
		}

	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");

	}

	@Override
	public void maisVolume() {
		if(this.getLigado() == true){
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossivel aumentar volume!");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossivel diminuir volume!");
		}

	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}

	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}

	}

	@Override
	public void play() {
		if(this.getLigado() && !(getTocando())) {
			this.setTocando(true);
		}

	}

	@Override
	public void pause() {
		if(this.getLigado() && getTocando()) {
			this.setTocando(false);
		}

	}

}

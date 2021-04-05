package exercicio1;

public class Video {
	
	private String nomeAula;
	private String professor;
	private double duracao;
	private boolean execucao;
	
	void status() {
		System.out.println("Aula: "+this.nomeAula);
		System.out.println("Professor: "+this.professor);
		System.out.println("Duração da aula: "+this.duracao);
		System.out.println("Aula esta ocorrendo? "+this.execucao);
		
	}
	void estudando() {
		if(this.execucao == true) {
			System.out.println("Aluno estudando");
		}else {
			System.out.println("Aula pausada!");
		}
		
	}
	void play() {
		this.execucao = true;
		
	}
	void pause() {
		this.execucao = false;
		
	}
	
	public String getNomeAula() {
		return nomeAula;
	}
	public void setNomeAula(String nomeAula) {
		this.nomeAula = nomeAula;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public boolean isExecucao() {
		return execucao;
	}
	public void setExecucao(boolean execucao) {
		this.execucao = execucao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(duracao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (execucao ? 1231 : 1237);
		result = prime * result + ((nomeAula == null) ? 0 : nomeAula.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (Double.doubleToLongBits(duracao) != Double.doubleToLongBits(other.duracao))
			return false;
		if (execucao != other.execucao)
			return false;
		if (nomeAula == null) {
			if (other.nomeAula != null)
				return false;
		} else if (!nomeAula.equals(other.nomeAula))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}
	
	

}

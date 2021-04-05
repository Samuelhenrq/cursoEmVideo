package exercicioPratico;

public class ContaBanco {
	public static void main(String[] args) {
		Conta pessoa1 = new Conta();
		pessoa1.setNumConta(9517513);
		pessoa1.setDono("Jubileu da Silva");
		pessoa1.abrirConta("CC");
		
		pessoa1.depositar(100);
		pessoa1.sacar(150);
		pessoa1.fecharConta();
				
		Conta pessoa2 = new Conta();
		pessoa2.setNumConta(653516);
		pessoa2.setDono("Creuza Oliveira Jarbas");
		pessoa2.abrirConta("CP");
				
		pessoa2.depositar(500);
		pessoa2.sacar(151);
		
		
		pessoa1.estatusConta();
		pessoa2.estatusConta();
		
	}

}

package bytebank;

public class EditorDeVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo getBonificacao do EDITOR DE VIDEO.");
		return super.getBonificacao() + 100;
	}
}

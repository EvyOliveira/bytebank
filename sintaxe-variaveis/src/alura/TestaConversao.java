package alura;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		double valor = (int) salario;
		
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		long numeroGrande = 32432423523L;
		short numeroPequeno = 2131;
		byte menorTipoPossivel = 127;
		
		double primeiroValor = 0.2;
		double segundoValor = 0.1;
		double total = primeiroValor + segundoValor;
		
		System.out.println(total);
	}

}

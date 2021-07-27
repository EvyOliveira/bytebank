package alura;

public class TestaCondicionais {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompnhado = " + acompanhado);
		if (idade >= 18 || acompanhado == true) {
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente, você não pode entrar.");
		}
		
	}
}

package alura;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem idade igual ou superior � 18 anos!");
			System.out.println("Seja bem-vindo.");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar, "
						+ "pois est� acompanhado!");
			}
			System.out.println("Infelizmente, voc� n�o pode entrar.");
		}
	}
}
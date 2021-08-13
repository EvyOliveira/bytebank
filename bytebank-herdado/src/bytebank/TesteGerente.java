package bytebank;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("123123123-45");
		g1.setSalario(4500.0);
		
		System.out.println("O nome do gerente é " + g1.getNome() + ".");
		System.out.println("O CPF do gerente é: " + g1.getCpf());
		System.out.println("O salário do gerente é de " + g1.getSalario() + " reais.");
		
		g1.setSenha(2222);
		
		boolean autenticou =  g1.autentica(2222);
		
		System.out.println("Está autenticado? " + autenticou);
		
		System.out.println("O valor do salário com a bonificação será de " + g1.getBonificacao() + " reais.");
		
		System.out.println("A senha está como " + autenticou);

	}

}

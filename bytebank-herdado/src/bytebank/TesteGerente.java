package bytebank;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("123123123-45");
		g1.setSalario(4500.0);
		
		System.out.println("O nome do gerente �: " + g1.getNome());
		System.out.println("O CPF do gerente �: " + g1.getCpf());
		System.out.println("O sal�rio do gerente �: " + g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autenticou =  g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
		System.out.println("A senha est� como " + autenticou);

	}

}

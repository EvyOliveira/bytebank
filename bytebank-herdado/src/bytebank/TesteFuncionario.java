package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario evelyn = new Funcionario();
		evelyn.setNome("Evelyn Cristini Oliveira");
		evelyn.setCpf("1212121212-99");
		evelyn.setSalario(10000.00);
		
		System.out.println("O nome do funcion�rio �: " + evelyn.getNome());
		System.out.println("A bonifica��o do funcion�rio corresponde �: " + evelyn.getBonificacao() + " reais");
		
		//evelyn.salario = 300.0;
	}

}

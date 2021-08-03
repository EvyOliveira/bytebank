package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario evelyn = new Funcionario();
		evelyn.setNome("Evelyn Cristini Oliveira");
		evelyn.setCpf("1212121212-99");
		evelyn.setSalario(10000.00);
		
		System.out.println(evelyn.getNome());
		System.out.println(evelyn.getBonificacao());
		
	}

}

package bytebank;

public class TesteTipoFuncionario {

	public static void main(String[] args) {
		TipoFuncionario f1 = new TipoFuncionario();
		
		f1.setSalario(3000.0);
		
		System.out.println("O tipo de funcion�rio se encaixa na categoria: " + f1.getTipo());
		System.out.println("A bonifica��o do funcion�rio corresponde �: " + f1.getBonificacao() + " reais");
		
		TipoFuncionario f2 = new TipoFuncionario();
		
		f2.setTipo(1);
		f2.setSalario(5000.0);
		
		System.out.println("O tipo de funcion�rio se encaixa na categoria: " + f2.getTipo());
		System.out.println("A bonifica��o do funcion�rio corresponde �: " + f2.getBonificacao() + " reais");
		
		f2.setTipo(2);
		f2.setSalario(8000.0);
		
		System.out.println("O tipo de funcion�rio se encaixa na categoria: " + f2.getTipo());
		System.out.println("A bonifica��o do funcion�rio corresponde �: " + f2.getBonificacao() + " reais");
	
	}

}

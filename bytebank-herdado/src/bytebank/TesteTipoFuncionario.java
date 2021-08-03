package bytebank;

public class TesteTipoFuncionario {

	public static void main(String[] args) {
		TipoFuncionario f1 = new TipoFuncionario();
		
		f1.setSalario(3000.0);
		
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		TipoFuncionario f2 = new TipoFuncionario();
		
		f2.setTipo(1);
		f2.setSalario(5000.0);
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
	
	}

}

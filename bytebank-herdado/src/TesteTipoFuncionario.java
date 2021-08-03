
public class TesteTipoFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(3000.0);
		
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		TesteTipoFuncionario f2 = new TesteTipoFuncionario();
		
		f2.setTipo(1);
		f2.setSalario(5000.0);
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificação());
	
	}

}

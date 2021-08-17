package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marilia");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		//g1.autentica(2222);
		
		System.out.println("O nome do(a) gerente � " + nome + ".");
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		Funcionario e = new EditorDeVideo();
		e.setSalario(2500.0);
		
		Designer d = new Designer();
		e.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println("O sal�rio com a bonifica��o de um gerente � de " + controle.getSoma() + " reais.");
	}

}

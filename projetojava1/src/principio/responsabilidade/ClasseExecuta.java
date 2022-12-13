package principio.responsabilidade;

public class ClasseExecuta {

	public static void main(String[] args) {
		
		ContaBancaria conta =  new ContaBancaria();
		
		conta.setDescricao("Conta rubens");
		
		conta.depositoDinheiro(100);
		
		conta.sacarDinheiro(12);
		
		System.out.println(conta);
		
	}

}

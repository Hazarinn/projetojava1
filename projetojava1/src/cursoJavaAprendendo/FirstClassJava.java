package cursoJavaAprendendo;

public class FirstClassJava {

	public static void main(String[] args) {
		
		
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
				


		// Operadores tern�rios s�o para micro valida��es.
		
		String saidaResultado  = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ? "Aluno em recupera��o" : "Reprovado ";
		
		
		
		System.out.println(saidaResultado);
		
		
		
		

	}

}

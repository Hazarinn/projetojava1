package cursoJavaAprendendo;

public class OperacoesLogicasAninhadas {

	public static void main(String[] args) {


		
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 60;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
				
		
		// Operações logicas aninhadas : São operações dentro de operações
		
		if(media >= 50) {
			if(media >70) {
				System.out.println("Aluno está aprovado de forma direta");
			}else {
				System.out.println("Aluno está em recuperação");
			}
		}else {
			System.out.println("Aluno reprovado de forma direta");
		}

	}

}

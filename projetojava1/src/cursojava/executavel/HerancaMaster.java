package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class HerancaMaster {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Rubens");
		aluno.setNomeEscola("Jdev treinamento");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("dasdsa");
		diretor.setNome("Diego");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("42343432");
		secretario.setIdade(18);

		System.out.println(aluno.pessoaMaiorIdade() + "- " +  aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario aluno é: " + aluno.salario()); 
		System.out.println("Salario diretor é: " + diretor.salario());
		System.out.println("Slario secretario é: " + secretario.salario()); 
	
		teste(aluno);
 
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + "e o salario é de " + pessoa.salario());
	}

}

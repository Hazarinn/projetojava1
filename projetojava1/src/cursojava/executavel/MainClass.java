package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;

public class MainClass {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {

			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o login:  ");
			String senha = JOptionPane.showInputDialog("Informe a senha: ");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				/*
				 * É uma lista que dentro dela temos uma chave e valor para identificar o objeto
				 */

				List<Aluno> alunos = new ArrayList<Aluno>();
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno ? ");

					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual a data de nascimento ? "); String rg =
					 * JOptionPane.showInputDialog("Qual o RG? "); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF? "); String nomeMae =
					 * JOptionPane.showInputDialog("Qual o nome da mãe? "); String nomePai =
					 * JOptionPane.showInputDialog("Qual o nome do pai?  "); String dataMatricula =
					 * JOptionPane.showInputDialog("Data da matrícula: "); String serie =
					 * JOptionPane.showInputDialog("Qual a serie? "); String nomeEscola =
					 * JOptionPane.showInputDialog("Qual o nome da escola:  ");
					 */

					Aluno aluno = new Aluno();
					;// Aqui será o João.
//
					aluno.setNome(nome);
					aluno.setIdade(Integer.valueOf(idade));

					/*
					 * aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
					 * aluno.setNumeroCpf(cpf); aluno.setNomeMae(nomeMae);
					 * aluno.setNomePai(nomePai); aluno.setDataMatricula(dataMatricula);
					 * aluno.setSerieMatriculado(serie); aluno.setNomeEscola(nomeEscola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + pos);
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + pos);

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno.getDisciplina().add(disciplina);
					}
//		

					// For responsável por adicionar os nomes das disciplinas e as notas de cada uma

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

					int posicao = 1;

					if (escolha == 0) {

						int continuarRemover = 0;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4? ");
							aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
						}
					}

					alunos.add(aluno);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {

						maps.get(StatusAluno.REPROVADO).add(aluno);
					} else {

						aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO);
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
				}

				System.out.println("---------------Lista aprovados-----------------");

				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado " + aluno.getAlunoAprovado2() + " com media de " + aluno.getMediaNota());
				}

				System.out.println("---------------Lista Reprovados-----------------");

				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado " + aluno.getAlunoAprovado2() + " com media de " + aluno.getMediaNota());
				}

				System.out.println("---------------Lista Recuperação-----------------");

				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado " + aluno.getAlunoAprovado2() + " com media de " + aluno.getMediaNota());
				}
			} else {

				System.out.println("Digite o login e senha correto.");

			}
		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			// Imprime erro no console Java
			e.printStackTrace();

			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i <= e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de  erro " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de  erro " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Classe de erro " + e.getStackTrace()[i].getClassName());

			}
			JOptionPane.showMessageDialog(null, "Erro ao converter numro " + saida.toString());

		} catch (NullPointerException e) {

			JOptionPane.showMessageDialog(null, "Opa, um null pointer exception: " + e.getClass());

		} catch (FileNotFoundException e) {

			e.printStackTrace();

			JOptionPane.showMessageDialog(null, "erro de exceção customizada: " + e.getMessage());

		} finally {
			// Sempre é executado ocorrendo erros ou não.

			JOptionPane.showMessageDialog(null, "Obrigado por aprender comigo ");

		}
	

	}

	public static void lerArquivo() throws FileNotFoundException {
		
		
		File arquivo = new File("c://arqfuivo.txt");
		Scanner sc = new Scanner(arquivo);	
		
		
	
		
	
	}
}

// aqui

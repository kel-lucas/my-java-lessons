package execut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import aulixilarClass.functionAutentic;
import avaclass.Aluno;
import avaclass.Diretor;
import avaclass.Disciplina;
import avaclass.Secretario;
import consts.statusAlun;
import interfaceJava.permitirAcesso;

public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		
		String login = JOptionPane.showInputDialog("Informe o seu login: ");
		String senha = JOptionPane.showInputDialog("Informe a sua senha: ");

		
		
		if (new functionAutentic(new Diretor(login, senha)).autenticar() == true) { /*Somente autorizados == implementação da interface*/
		
		List<Aluno> alunos = null;
		
		/* É uma lista do tipo dicionario key-value */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); 
		
		for (int qtd = 1; qtd <= 2; qtd++) {
			
			Aluno aluno1 = new Aluno();

			String nome = JOptionPane.showInputDialog("Insira o nome do aluno: " + qtd + " º");
			/*
			 * String idade = JOptionPane.showInputDialog("Digite a idade do aluno:\n");
			 * String dataNascimento =
			 * JOptionPane.showInputDialog("Digite sua data de nascimento"); String
			 * registroGeral = JOptionPane.showInputDialog("Digite seu Registro Geral");
			 * String numeroCpf = JOptionPane.showInputDialog("Digite seu nï¿½mero de CPF");
			 * String nomeEscola = JOptionPane.showInputDialog("Innsira o nome da escola:");
			 * String nomePai = JOptionPane.showInputDialog("Digite o nome do pai:"); String
			 * nomeMae = JOptionPane.showInputDialog("Digite o nome da mï¿½e:"); String
			 * dataMatricula =
			 * JOptionPane.showInputDialog("Digite a data da sua matricula"); String
			 * serieMatriculada =
			 * JOptionPane.showInputDialog("Digite a sï¿½rie atual do aluno:");
			 */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.parseInt(idade)); aluno1.setNomeEscola(nomeEscola);
			 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			 * aluno1.setSerieMatriculado(serieMatriculada);
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setNumeroCpf(numeroCpf);
			 * aluno1.setRegistroGeral(registroGeral);
			 * aluno1.setDataMatricula(dataMatricula);
			 */

			for (int x = 1; x <= 1; x++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + x + " ");
				String notaDisciplina = JOptionPane.showInputDialog("Insira a nota da disiciplina: ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.parseDouble(notaDisciplina));

				aluno1.getMaterias().add(disciplina);

			}

			int choice = JOptionPane.showConfirmDialog(null, "Deseja remover uma disciplina? ");

			if (choice == 0) {

				int removeOn = 0;
				int position = 1;

				while (removeOn == 0) {

					String remover = JOptionPane.showInputDialog("Qual disciplina, de 1 a 4?");
					int GetOut = Integer.parseInt(remover) - position;
					aluno1.getMaterias().remove(GetOut);

					position++;
					removeOn = JOptionPane.showConfirmDialog(null, "Quer continuar a remover?");

				}
			}

			alunos.add(aluno1);
		}
		
		maps.put(statusAlun.APROVADO, new ArrayList<Aluno>());
		maps.put(statusAlun.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(statusAlun.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			String stats = aluno.getAlunoAprovacao();
			if (stats.equalsIgnoreCase(statusAlun.APROVADO)) {
				maps.get(statusAlun.APROVADO).add(aluno);
			}else
			if (stats.equalsIgnoreCase(statusAlun.RECUPERACAO)) {
				maps.get(statusAlun.RECUPERACAO).add(aluno);
			}else
			if (stats.equalsIgnoreCase(statusAlun.REPROVADO)) {
				maps.get(statusAlun.REPROVADO).add(aluno);
			}
			
		}
		
		System.out.println("Lista de alunos aprovados:");
		for (Aluno aluno : maps.get(statusAlun.APROVADO)) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMediaNota());
			
		}
		
		System.out.println("Lista de alunos recuperados:");
		for (Aluno aluno :  maps.get(statusAlun.RECUPERACAO)) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMediaNota());
			
		}
		
		System.out.println("Lista de alunos Reprovados:");
		for (Aluno aluno :  maps.get(statusAlun.REPROVADO)) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMediaNota());
			
		}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não autorizado");
		}
		
		
		/*Aqui*/
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao processar notas.");
			
		}
			
		
	}
}

		/*** Percorrendo a lista por posições em vez de usar o foreach ***/
		/*
		 * for (int pos = 0; pos < alunos.size(); pos++){ Aluno aluno = alunos.get(pos);
		 * 
		 * 
		 * if (aluno.getNome().equalsIgnoreCase("kelvin")){
		 * 
		 * Aluno trocar = new Aluno(); trocar.setNome("Nivlek");
		 * 
		 * Disciplina disciplina = new Disciplina();
		 * disciplina.setDisciplina("Herbologia"); disciplina.setNota(10);
		 * 
		 * trocar.getMaterias().add(disciplina);
		 * 
		 * alunos.set(pos, trocar); aluno = alunos.get(pos); }
		 * 
		 * System.out.println("Aluno = " +aluno.getNome());
		 * System.out.println("Média do aluno: " +aluno.getMediaNota());
		 * System.out.println("Resultado: " +aluno.getAlunoAprovacao());;
		 * System.out.println("------------------------------------------");
		 * 
		 * 
		 * Diferentes tipos de interação
		 * 
		 * 
		 * for (Disciplina disciplina : aluno.getMaterias()) {
		 * System.out.println("Disciplina: " +disciplina.getDisciplina()+ "\nNota: "
		 * +disciplina.getNota()); }
		 * 
		 * 
		 * 
		 * for (int posM = 0; posM < aluno.getMaterias().size(); posM++) {
		 * 
		 * Disciplina disciplina = aluno.getMaterias().get(posM);
		 * 
		 * System.out.println("Disciplina: " +disciplina.getDisciplina()+ "\nNota: "
		 * +disciplina.getNota()); }
		 * System.out.println("------------------------------------------"); }
		 */

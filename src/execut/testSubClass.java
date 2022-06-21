package execut;

import avaclass.Aluno;
import avaclass.Diretor;
import avaclass.Pessoa;
import avaclass.Secretario;

public class testSubClass {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Kelvin Lucas");
		aluno.setIdade(19);
		
		Diretor diretor = new Diretor();
		diretor.setTempoDirecao(3);
		diretor.setIdade(56);
		
		Secretario secretario = new Secretario();
		secretario.setExp("7 anos");
		secretario.setNumeroCpf("000.000.000-00");
		secretario.setIdade(35);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.deMaior());
		System.out.println(diretor.deMaior());
		System.out.println(secretario.deMaior());
		
		System.out.println(aluno.soldo());
		System.out.println(diretor.soldo());
		System.out.println(secretario.soldo());
		
		Pessoa pessoa = new Aluno();
		
		pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
		}
		
		public static void teste (Pessoa pessoa) {
			System.out.println("Esta é uma pessoa = " +pessoa.getNome()+ " e seu salário é " +pessoa.soldo());
		}
		
	}

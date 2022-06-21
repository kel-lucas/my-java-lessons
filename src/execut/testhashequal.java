package execut;

import avaclass.Aluno;

public class testhashequal {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Lucas");
		aluno1.setNumeroCpf(null);
		Aluno aluno2 = new Aluno("Lucas");
		aluno2.setNumeroCpf(null);
		
		
		System.out.println((aluno1.equals(aluno2) ? "Aos alunos são iguais entre si" :"Os alunos diferem entre si"));
	}

}

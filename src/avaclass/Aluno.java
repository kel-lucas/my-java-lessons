package avaclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import consts.statusAlun;

/*Commentario em Java**/
public class Aluno extends Pessoa {
	private String dataMatricula;
	
	private String nomeEscola; 
	private String serieMatriculado;
	
	private List<Disciplina> materias = new  ArrayList<Disciplina>();
	
	public List<Disciplina> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Disciplina> materias) {
		this.materias = materias;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public Aluno() {
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		super.nome = nomePadrao;
		super.idade = idadePadrao;
	}
	
	public double getMediaNota() {
		double somaNotas = 0;
		
		for (Disciplina disciplina : materias) {
			somaNotas += disciplina.getNota();
			
		}
		return somaNotas / materias.size();
	}
	
	public String  getAlunoAprovacao() {
		double media = this.getMediaNota();
		
		if (media >= 6) {
			if (media >=7) {
				return statusAlun.APROVADO;
			}else {
				return statusAlun.RECUPERACAO;
			}
		}return statusAlun.REPROVADO;
		
		
	}
	
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
	
	@Override /*Annotation de reescrita de metódo herdado da super class*/
		public boolean deMaior() {
			return idade >= 21;
		}

	@Override
	public double soldo() {
		return 0;
	}
	
	
	
}

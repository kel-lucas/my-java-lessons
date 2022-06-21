package avaclass;

import interfaceJava.permitirAcesso;

public class Diretor extends Pessoa implements permitirAcesso {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titualacao;
	
	private String login;
	private String password;
	
	public Diretor(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public Diretor () {
		
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitualacao() {
		return titualacao;
	}
	public void setTitualacao(String titualacao) {
		this.titualacao = titualacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titualacao="
				+ titualacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double soldo() {
		return 1800* 3.5;
	}
	
	@Override
	public boolean autenticar() {
		return login.equalsIgnoreCase("super") && password.equalsIgnoreCase("super");
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		
		return this.autenticar();
	}
	
	

}

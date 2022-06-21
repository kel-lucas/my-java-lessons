package avaclass;

import interfaceJava.permitirAcesso;

public class Secretario extends Pessoa implements permitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String exp;
	
	private String login;
	private String password;
	
	public Secretario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	public Secretario() {
		
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}

	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", exp=" + exp + ", nome=" + nome
				+ ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double soldo() {
		return 1800*0.5;
	}
	
	
	/*implementação do método declarado dentro da interface*/

	
	@Override
	public boolean autenticar(String login, String password) {
		
		return this.autenticar();
	}


	@Override
	public boolean autenticar() {
		
		return login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin");
	}
	
	

}

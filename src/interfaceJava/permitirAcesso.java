package interfaceJava;


/*Interface ==  contrato*/
public interface permitirAcesso {
	
	/*Metódos com nome iguais, mas ccom assinaturas diferentes*/
	public boolean autenticar();
	public boolean autenticar(String login, String senha); /* declaração dentro da interface*/
	
}

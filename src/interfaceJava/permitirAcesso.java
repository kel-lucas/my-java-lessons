package interfaceJava;


/*Interface ==  contrato*/
public interface permitirAcesso {
	
	/*Met�dos com nome iguais, mas ccom assinaturas diferentes*/
	public boolean autenticar();
	public boolean autenticar(String login, String senha); /* declara��o dentro da interface*/
	
}

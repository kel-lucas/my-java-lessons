package aulixilarClass;

import interfaceJava.permitirAcesso;

/* verifica se o objeto implementa permitirAcesso e se true, chama o método. */
public class functionAutentic {
	
	private permitirAcesso acess;
	
	public boolean autenticar () {
		return acess.autenticar();
	}
	
	public functionAutentic(permitirAcesso acess) {
		this.acess = acess;
		
	}

}

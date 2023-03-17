//Logica de autentificacion dedidida por sistema interno
/*
 * dentro de cada extension existira
 */

public class AutentificacionUtil {

	private String clave;
	
	//1
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}

	//2
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}

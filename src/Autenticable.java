//implementacion para autentificar funcionarios
/*
 * Decide si eres elegible para entrar o salir
 */
public interface Autenticable {

	//	abstract all
	public  void setClave(String clave);
			
	public  boolean iniciarSesion(String clave);			
		
}

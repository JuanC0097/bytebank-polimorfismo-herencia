//Logica de como inicio sesion
//nexo para inicia sesion en el sistema
public class SistemaInterno {

	//1.Attributes
	private String clave = "Clavegenerica";
	
	//Mutates
	//Metodo ejecutable para todos los que tengan el rotulo de la interfaz
	/*
	 * 
	 */
	public boolean autentica(Autenticable gerente) {
		
		boolean puedeIniciar = gerente.iniciarSesion(this.clave);
		
		if(puedeIniciar) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
			}
		}
	
	
	
	
}

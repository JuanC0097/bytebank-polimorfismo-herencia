//Clase hija de funcionario
public class Gerente extends Funcionario {

	//1. Atributos
	private String contrasena;
	
	//2. Necesario solo set 	
	public void setContraseña( String contraseña) {
		
		this.contrasena = contraseña;
		
	}
	
	//Metodos
	
	//Sobre escritura del metodo abtracto
	public double getBonificacion() {
		
		return super.getSalario() + this.getSalario() * 0.5;
	}
	
	//Autentificar Gerente.
		public boolean autentificarSesion(String contrasena) {
			
			if(this.contrasena == contrasena) {
				return true;
				
			}return false;
			
		}
	
}

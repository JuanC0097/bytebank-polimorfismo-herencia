//					Extiende de:
public class Gerente extends Funcionario {

	private String contrasena;
	
	public void setContraseña( String contraseña) {
		
		this.contrasena = contraseña;
		
	}
	
	public boolean autentificarSesion(String contrasena) {
		
		if(this.contrasena == contrasena) {
			return true;
			
		}return false;
		
	}
	//Sobreescritura del metodo de la base class
	public double getBonificacion() {
		
		return super.getSalario() + super.getBonificacion() ;
		
	}
	
}

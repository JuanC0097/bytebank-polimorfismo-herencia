//rotular administrador con la interfaz de acceso
public class Administrador extends Funcionario implements Autenticable {

	public AutentificacionUtil util;
	//Constructor
	public Administrador(){
		this.util = new AutentificacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}
	
	//Implementacion de la caja de herramientas
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	@Override
	public boolean iniciarSesion(String clave){
		return this.util.iniciarSesion(clave);
	}
	
}

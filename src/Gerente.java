//Clase hija de funcionario
public class Gerente extends Funcionario implements Autenticable {


	public AutentificacionUtil util;
	
	
	public Gerente(){
		this.util = new AutentificacionUtil();
	}
	
	//Sobreescritura del metodo
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return 2000;
	}
	
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
	
	
}

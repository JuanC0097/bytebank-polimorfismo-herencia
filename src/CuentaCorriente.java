
public class CuentaCorriente extends Cuenta {

	/*
	 * Acceder al constructor de la clase padre, para continuar con
	 * las reglas del negocio
	 */
	//Constructor de cuentacorriente,override del constructor Cuenta
	public CuentaCorriente(int agencia, int numero) {
		
		super(agencia, numero);
		
	}
	
}

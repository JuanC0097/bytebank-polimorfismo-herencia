//Clase hija de Cuenta
public class CuentaAhorros extends Cuenta {

	@Override//Escritura del metodo abstracto de Cuenta
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	
	//Constructor de las clase padre Cuenta
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	

}
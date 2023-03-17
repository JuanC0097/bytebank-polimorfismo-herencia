//Clase hija de Cuenta
public class CuentaAhorros extends Cuenta {

	//Constructor de las clase padre Cuenta
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

}
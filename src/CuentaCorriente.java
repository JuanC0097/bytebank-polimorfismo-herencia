//Clase hija de Cuenta
public class CuentaCorriente extends Cuenta {

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	//Constructor de la clase padre
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);

	}

	//Sobreescritura metodo clase Cuenta <nombreMetodo + Ctrl + espacio
	/*
	 * Firma del metodo igual, no cambia.
	 * Necesario el mensaje, para informar la sobreescritura
	 */
	@Override
	public boolean retira(double valor) {
		double comision = 0.2;
		return super.retira(valor + comision);
	}
	
}

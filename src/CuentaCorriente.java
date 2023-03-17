//Clase hija de Cuenta
public class CuentaCorriente extends Cuenta implements Tributacion{

	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	//Sobreescritura metodo padre Cuenta <nombreMetodo + Ctrl + espacio
	/*
	 * Firma del metodo igual, no cambia.
	 * Necesario el mensaje, para informar la sobreescritura
	 */
	@Override
	public void retira(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.retira(valor + comision);
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}


public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		
		Cuenta cuenta = new CuentaAhorros(215, 546);
		cuenta.depositar(200);
		try {
			cuenta.retira(200);
			cuenta.retira(10);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}
}

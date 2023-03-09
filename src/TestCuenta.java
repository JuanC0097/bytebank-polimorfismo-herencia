
public class TestCuenta {

	public static void main(String[] args) {
		
		//Prueba Comision
		CuentaCorriente cc = new CuentaCorriente(1, 2);
		CuentaAhorros ca = new CuentaAhorros(2, 1);
		
		cc.depositar(1000);
		cc.transferir(500, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
	}
	
}

//Prueba del metodo tributacion
public class TestTributacion {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(20, 15);
		cc.depositar(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoreDeimpuesto calc = new CalculadoreDeimpuesto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImpuesto());
	}

}

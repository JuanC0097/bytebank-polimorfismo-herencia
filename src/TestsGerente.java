
public class TestsGerente {

	public static void main(String[] args) {
		
		//Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		//System.out.println("Prueba metodo bonificacion-Gerente");
		//System.out.println(gerente.getBonificacion());
		
		Funcionario gerente = new Funcionario();
		
		gerente.setSalario(6000);
		gerente.setTipo(1);
		System.out.println(gerente.getBonificacion());
		gerente.setTipo(0);
		System.out.println();
		System.out.println(gerente.getBonificacion());
	}
}

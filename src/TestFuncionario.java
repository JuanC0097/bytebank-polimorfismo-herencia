
public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario juan = new Contador();
		juan.setNombre("Juan");
		juan.setDocumento("10102515");
		juan.setSalario(2000);
		juan.setTipo(0);
		
		System.out.println("metodos get");
		System.out.println(juan.getNombre());
		System.out.println(juan.getDocumento());
		System.out.println(juan.getSalario());
		System.out.println();
		System.out.println();
		
		System.out.println("Metodo Bonificacion");
		System.out.println("Salario: " +juan.getSalario());
		System.out.println("Bonificacion: "  +juan.getBonificacion());
		
	}
	
}

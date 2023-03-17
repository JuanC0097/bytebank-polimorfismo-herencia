//Clase mas generica	|Clase abstracta:
public abstract class Funcionario {

	//1. Atributos
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	//2. Constructor por defecto
	public Funcionario() {
		
	}
	
	//3. getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	//3.Metodos Abtracto
	//abliga a las clases hijas a sobreescribirlo.
	public abstract double getBonificacion();
	
}

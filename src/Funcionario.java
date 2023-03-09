//Clase mas generica	|Clase Padre
public class Funcionario {

	//1. Atributos
	private String nombre;
	private int documento;
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
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
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

	//3.Metodos
	//Reglas del negocio: los funcionarios genericos obtienes 5% del salario como bonificacion.
	public double getBonificacion(){
	return this.salario * 0.05;
	}
	
	
	
	
	
	
	
	
	
	
}

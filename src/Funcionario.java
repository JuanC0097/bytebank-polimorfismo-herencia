
public class Funcionario {

	private String nombre;
	private int documento;
	private double salario;
	private int tipo;
	
	//1.Constructor: metodo del mismo tipo de retorno de la clase, se pueden crear con parametros.
	public Funcionario() {
		
	}
	
	//2. getters y setters
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
	public double getBonificacion(){
		return this.salario * 0.1;
	}
	
	
	
	
	
	
	
	
	
	
}

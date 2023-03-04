
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
		//traera el 10% del salario
		//si tipo es 1 es gerente
		//si tipo de 0 es funcionario
		if (this.tipo == 0) {
			return this.salario * 0.1;
			
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return 0;
			
		}
		
	}
	
}

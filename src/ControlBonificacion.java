//Clase padre
public class ControlBonificacion {
	
	//1.Atributos
	private double suma;
	
	//2.Metodos:
	//Acumula y cuenta el valor depositado total del funcionario 
	public double regitrarSalario(Funcionario funcionario) {
		
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
		
	}
	
}

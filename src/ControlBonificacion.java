//bonificacion total como banco a funcionarios
public class ControlBonificacion {
	//sumar todas las bonificaciones como parametro
	private double suma;
	
	/*
	 * El parametro cambiara segun necesidad, ya que el Funcionario es la clase mas genererica
	 * y el metodo podra aplicarse a clases mas especificas
	 */
	public double regitrarSalario(Funcionario funcionario) {
		
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
		
	}
	
}

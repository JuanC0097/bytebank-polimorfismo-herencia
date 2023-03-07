
public class TestControlBonificacion {

	public static void main(String[] args) {
		
		//Creacion de funcionario
		Funcionario daniel = new Funcionario();
		Gerente david = new Gerente();
		Contador juan = new Contador();
		
		//declarar salarios
		daniel.setSalario(2000);
		david.setSalario(10000);
		juan.setSalario(5000);
		
		//Creacion de suma
		ControlBonificacion controlBonificacion = new ControlBonificacion();//Creacion new control
		
		//declarar registro de salario
		controlBonificacion.regitrarSalario(daniel);//Funcionario
		controlBonificacion.regitrarSalario(david);//Gerente
		controlBonificacion.regitrarSalario(juan);//Contador
		
	}
	
}

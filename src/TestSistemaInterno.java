
public class TestSistemaInterno {

	public static void main(String[] args) {
		
		
		Gerente gerente1 = new Gerente();
		SistemaInterno sistema = new SistemaInterno();
		Administrador admin = new Administrador();
		
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
		
	}
	
}

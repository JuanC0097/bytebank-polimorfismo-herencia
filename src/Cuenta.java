//Clase mas genericas		|Clase abtracta
public abstract class Cuenta {

	//1.Atributos
	//atributo accesible por una clase hija
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();
    
    //2.Atributo Compartido por todas las instancias,para el constructor
    private static int total;
    
    //3.Constructor
    /*
     * Recibe dos atributos
     * Mensaje de Creacion de cuenta
     * Acumulacion de cuentas creadas
     */
    public Cuenta(int agencia, int numero) {
    	
    	if(agencia < 1) {
    		throw new IllegalArgumentException("Agencia Invalida");
    	}
    	
    	if(numero < 1) {
    		throw new IllegalArgumentException("Numero de Cuenta Invalido");
    	}
    	
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Creacion de cuenta, Cuenta n° " +  this.numero);
    	
    	Cuenta.total ++;
    	
    }
    
    //4. Metodos
    //Metodo abtracto
    public abstract void depositar(double valor);
    
    //Metodo con bomba
    public void retira(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException("No tienes saldo suficiente");
        }
    	this.saldo -= valor;
    }
    //enviar y retirar valor
    public boolean transferir(double valor, Cuenta destino) {
        if(this.saldo >= valor) {	
            try {
				this.retira(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
            destino.depositar(valor);
            return true;   
        } return false;
    }
    
    //5.getters y setters
    public double getSaldo() {
		return saldo;
	}
    
    public int getAgencia() {
		return agencia;
	}
    
	public void setAgencia(int agencia) {
	   	if(agencia > 0) {
    		this.agencia = agencia;
	 }
	}
    
    public int getNumero() {
		return numero;
	}
   

	public void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
    
}

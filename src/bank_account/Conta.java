package bank_account;

public class Conta {
	
	private int numero;
	private double saldo;
	
	public Conta () {
		
	}
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void exibirConta() {
		System.out.println(" A conta numero " + numero + " tem saldo de: R$ " + saldo);
	}
	
	
	public static void main (String args[]) {
		
		Conta conta001 = new Conta();
		conta001.setNumero(001);
		conta001.setSaldo(100);
		conta001.exibirConta();
	}
}

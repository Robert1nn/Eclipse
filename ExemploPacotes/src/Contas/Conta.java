package Contas;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	
	//CONTRUTOR DA CLASSE CONTA()
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}
	
	public void sacar(double valor){
		saldo = saldo -= valor;
		
	}
	
	public void depositar(double valor) {
		saldo = saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInformacoes() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
}

package Contas;

public class AberturaConta {
	public static void main(String[] args) {
		Conta contac = new ContaCorrente();
		contac.depositar(100);
		Conta poupanca = new ContaPoupanca();
		
		//exemplo de polimorfismo acima
		
		contac.transferir(50, poupanca);
		poupanca.imprimirExtrato();
	}

}


public class Main {

	public static void main(String[] args ) {
		
		Cliente pedro = new Cliente ();
		pedro.setNome("Pedro Henrique");
		
		Conta cc = new ContaCorrente (pedro);
		Conta poupanca = new ContaPoupanca (pedro);
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
	
}

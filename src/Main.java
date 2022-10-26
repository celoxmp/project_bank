import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		List<Conta> aux = new ArrayList<Conta>();
		aux.add(poupanca);
		aux.add(cc);
		banco.setContas(aux);
		System.out.println("=== Contas ===");
		banco.listContasClientes();
	}

}

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Banco {
	
	private @Getter @Setter String nome;
	private @Getter @Setter List<Conta> contas;

	public void listContasClientes() {
		for(Conta conta : contas) {
			System.out.println("Cliente: "+conta.cliente.getNome());
			System.out.println("Agencia: "+conta.getAgencia()+" Conta:"+conta.getNumero()+" Saldo: "+conta.getSaldo());
			System.out.println();
		}
	}

}

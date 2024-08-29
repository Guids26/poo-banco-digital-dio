import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();
	
	public Conta criarConta(Cliente cliente, TipoConta tipoConta) {
	Conta conta = null;
		if(cliente != null) {
			if(tipoConta == TipoConta.CORRENTE) {
				conta = new ContaCorrente();
			}else {
				conta = new ContaPoupança();
			}
			conta.agencia = 1;
			conta.numero = (int)(Math.random() * 9000000) + 1000000;
			conta.setTitular(cliente);
			this.contas.add(conta);
		}
		return conta;
	}

}

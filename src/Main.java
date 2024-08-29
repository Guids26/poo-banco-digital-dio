import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Banco guigonBank = new Banco();
		
		Cliente cliente = new Cliente();
		cliente.setCpf("123.456.789-10");
		cliente.setNome("Beluga Da Silva");
		cliente.setDataNascimento(LocalDate.of(2000, 5, 26));
		Conta conta1 = guigonBank.criarConta(cliente, TipoConta.CORRENTE);
		Cliente cliente2 = new Cliente();
		cliente.setCpf("987.654.321-01");
		cliente.setNome("Tais Santos");
		cliente.setDataNascimento(LocalDate.of(1997, 2, 13));
		Conta conta2 = guigonBank.criarConta(cliente2, TipoConta.POUPANÇA);
		conta1.setSaldo(13450);
		conta1.transferir(500, conta2);
		conta2.sacar(45);
		conta2.depositar(25);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
	}

}

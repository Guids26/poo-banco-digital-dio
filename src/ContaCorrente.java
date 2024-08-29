
public class ContaCorrente extends Conta {
	@Override
	void imprimirExtrato() {
		System.out.println("============ Extrato Conta Corrente, Agência: " + this.agencia +" Número: " + this.numero + " ============");
		System.out.println("============ Saldo: " + this.getSaldo());
	}
}

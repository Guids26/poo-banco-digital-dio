
public class ContaPoupança extends Conta {
	
	public static double TAXA_POUPANCA = 0.53;
	
	public void render() {
		this.setSaldo(this.getSaldo() * TAXA_POUPANCA);
	}
	
	@Override
	void imprimirExtrato() {
		System.out.println("============ Extrato Conta Poupança, Agência: " + this.agencia +" Número: " + this.numero + " ============");
		System.out.println("============ Saldo: " + this.getSaldo());
		System.out.println("============ Rendimento ao mês: " + TAXA_POUPANCA + "%");
	}
}


public abstract class Conta implements IConta {
	private double saldo;
	protected int numero;
	protected int agencia;
	private Cliente titular;
	
	abstract void imprimirExtrato();

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		if (this.saldoSuficiente(valor)) {
			this.saldo -= valor;
		}
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (this.saldoSuficiente(valor) && contaDestino != null) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
		}

	}

	public Boolean saldoSuficiente(double valor) {
		return this.saldo >= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}

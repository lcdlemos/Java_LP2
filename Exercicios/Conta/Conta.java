public class Conta{
	int numero;
	double saldo;
	String titular;

	void saca(double quant) {
		this.saldo = this.saldo - quant;
	}

	void deposita(double quant) {
		this.saldo = this.saldo + quant;
	}
}
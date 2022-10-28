
package banco;
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDavi = new Conta(1111,123456);
		contaDoDavi.deposita(100);
		contaDoDavi.deposita(50);
		System.out.println(contaDoDavi.getSaldo());

		boolean conseguiuRetirar = contaDoDavi.saca(20);
		System.out.println(contaDoDavi.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaBruna = new Conta(6644,969063);
		contaDaBruna.deposita(1000);

		boolean sucessoTransferencia = contaDaBruna.transfere(300, contaDoDavi);

		if (sucessoTransferencia) {
			System.out.println("A transferencia com sucesso");

		} else {
			System.out.println("Saldo insuficiente para realização da transferencia");

		}
		System.out.println(contaDaBruna.getSaldo());
		System.out.println(contaDoDavi.getSaldo());
	}

}

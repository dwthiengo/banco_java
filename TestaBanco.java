
package banco;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente Davi = new Cliente();
		Davi.setNome("Davi");
		Davi.setCpf("12345678912");
		Davi.setProfissao("estudante");

		Conta contadoDavi = new Conta(1111,123456);
		contadoDavi.deposita(1000);

		contadoDavi.setTitular(Davi);
		System.out.println(contadoDavi.getTitular().getNome());
		System.out.println(contadoDavi.getTitular());

	}
}
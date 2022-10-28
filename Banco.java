
package banco;

public class Banco {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1111,123456);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(1111,654321);
        segundaConta.deposita(50);

        System.out.println("A primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("A segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta);
    }

}

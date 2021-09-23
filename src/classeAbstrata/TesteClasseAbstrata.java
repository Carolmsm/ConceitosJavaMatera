package classeAbstrata;

public class TesteClasseAbstrata {

    public static void main(String[] args) {
        Conta poupanca = new ContaPoupanca();
        poupanca.setSaldo(400.50);
        poupanca.imprimeExtrato();

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(670.99);
        contaCorrente.imprimeExtrato();
    }
}

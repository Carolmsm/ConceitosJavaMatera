package interfaces;

public class TesteInterface {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(8000.00);
        contaCorrente.sacar(2000.00);

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(9000.00);
        poupanca.sacar(2000.00);

        Extrato extrato = new Extrato();
        extrato.gerarExtrato(contaCorrente);
        extrato.gerarExtrato(poupanca);

    }
}

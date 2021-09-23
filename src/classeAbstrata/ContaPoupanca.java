package classeAbstrata;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Poupança");
        System.out.println(this.getSaldo());
    }
}

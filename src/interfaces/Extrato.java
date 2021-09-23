package interfaces;

public class Extrato {

    public void gerarExtrato(Conta conta){

        System.out.println("Saldo Atual");
        System.out.println(conta.getSaldo());
    }
}

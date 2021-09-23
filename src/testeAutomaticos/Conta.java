package testeAutomaticos;

public class Conta {

    private Double saldo;
    private Double taxaOperacao;

    public Conta(Double saldo, Double taxaOperacao) {
        super();
        this.setSaldo(saldo);
        this.setTaxaOperacao(taxaOperacao);

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;

    }

    public void sacar(Double valor) {
        this.saldo -= valor + taxaOperacao;
    }
}

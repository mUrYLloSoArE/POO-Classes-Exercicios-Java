package classes;

public class ContaCorrente {

    public double saldo =0;
    double saldoAtual=0;
   public String numeroConta, titular;

    public ContaCorrente(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public  void deposito(double qtd){
        saldo+=qtd;
        saldoAtual = saldo;
    }
    public  void saque(double qtd){
        saldo-=qtd;
        saldoAtual = saldo;
    }

}

public class Caixa {


    double saldo;
    double saldoAtual=0;

    public Caixa(double saldo) {
        this.saldo = saldo;
    }
    public  void credito(double qtd){
        saldo+=qtd;
        saldoAtual = saldo;
    }
    public  void debito(double qtd){
        saldo-=qtd;
        saldoAtual = saldo;
    }

}

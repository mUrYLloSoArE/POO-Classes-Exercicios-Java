import classes.ContaCorrente;

public class Ex3 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("1234567","Muryllo Soares");
        conta.saldo = 1000;

        System.out.println("Dados da conta : ");
        System.out.println("Titular -> " + conta.titular);
        System.out.println("Número da conta -> " + conta.numeroConta);
        System.out.println("Saldo atual -> " + conta.saldo);

        conta.deposito(1000);
        System.out.println("Saldo atual após o depósito -> " + conta.saldo);

        conta.saque(500);
        System.out.println("Saldo atual após o saque -> " + conta.saldo);

    }
    }

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Caixa caixa = new Caixa(1000);

        int contador=0;
        int lancamentos=0;
        int opcao=0;
        boolean condicao=true;

        System.out.println(" Digite quantos lançamentos serão feitos no caixa ");
        lancamentos=sc.nextInt();



        while (contador<lancamentos){

            System.out.println("Digite a opção : 0 - Saida do Programa " + " 1- crédito ou 2 - débito " );
            opcao=sc.nextInt();

            if (opcao == 0){
                System.out.println(" Fim do programa ");
                condicao = false;
            }
            else if ( opcao == 1) {
                System.out.println(" Digite o lançamento a ser creditado : ");
                caixa.credito(sc.nextDouble());
            } else if ( opcao == 2) {
                System.out.println(" Digite o lançamento a ser debitado : ");
                caixa.debito(sc.nextDouble());
            }else {
                System.out.println("Opção inválida! ");
                condicao = false;
            }
            contador++;
        }



        System.out.println(" Saldo Atual -> " + caixa.saldo );


        sc.close();

    }

}

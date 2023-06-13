import classes.Carro;

public class Ex4 {
    public static void main(String[] args) {

        Carro carro = new Carro(4,"1977","Toyota");

        System.out.println("Informações do Carro : ");
        System.out.println("Marca -> " + carro.marca);
        System.out.println("Modelo -> " + carro.modelo);
        System.out.println("Quantidade de portas -> " + carro.qtdPortas);
        System.out.println("Potência em cavalos -> " + carro.potencia);

        carro.ligar();
        carro.desligar();

        }
    }

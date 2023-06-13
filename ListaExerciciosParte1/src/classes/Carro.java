package classes;

public class Carro {

    boolean chave ;
    public int qtdPortas;
    public String modelo,marca;
    public double potencia=2.0;

    public Carro(int qtdPortas, String modelo, String marca) {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public  void  ligar(){
        chave= true;
        System.out.println("Carro ligado!" + chave);
    }
    public  void  desligar(){
        chave= false;
        System.out.println("Carro desligado!" + chave);
    }

}

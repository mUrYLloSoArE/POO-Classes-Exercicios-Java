package classes;

public class Pessoa {

    public String nome;
    public  int idade;
    public  double  altura;
    public  double peso = 50.0;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void  engordar(){
        peso+=20;
        System.out.println("O seu peso atual -> " + peso);
    }
    public void  emagrecer(){
        peso-=10;
        System.out.println("O seu peso atual -> " + peso);
    }

    public  void  envelhecer(){
        if (idade<21){
            altura += 0.05;
        }
        System.out.println("Você completou mais um aninho -> " + (idade+=1) + " anos ");
        System.out.println("Sua altura -> " + altura + " cm ");
    }

    public  void  crescer(){
        altura+=0.02;
        System.out.printf("Você cresceu, veja a sua altura agora %.2f " , altura);
    }



}

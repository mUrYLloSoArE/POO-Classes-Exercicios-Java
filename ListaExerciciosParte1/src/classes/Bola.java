package classes;

public class Bola {
    public  String marca,cor,material;
    public  double circunferencia, velocidade;

    public String alterarCor(String corNova){
        cor=corNova;
        System.out.print("Cor da bola trocada -> ");
        return  cor;
    }

    public String mostrarCor(){
        System.out.print("Cor da bola agora é -> " );
        return cor;
    }

}

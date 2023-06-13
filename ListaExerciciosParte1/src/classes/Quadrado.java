package classes;

public class Quadrado {

    public  double tamanhoLado=50;

    public double ladoAlteracao(double lado ){
        tamanhoLado=lado;
        System.out.println("Valor do tamanho do lado alterado:" );
        return  tamanhoLado;
    }

    public double area(double ladoA){
        double area= tamanhoLado * ladoA;
        System.out.println("A área do quadrado é : "  );
        return area;
    }

}

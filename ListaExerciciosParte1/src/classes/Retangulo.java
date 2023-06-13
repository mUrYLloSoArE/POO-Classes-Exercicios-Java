package classes;

public class Retangulo {

    public  double tamanhoLado=50;

    public double ladoAlteracao(double lado ){
        tamanhoLado=lado;
        System.out.println("Valor do tamanho do lado alterado:" );
        return  tamanhoLado;
    }

    public double area(double ladoA){
        double area= tamanhoLado * ladoA;
        System.out.println("A área do retângulo é : "  );
        return area;
    }

    public double perimetro(double ladoA){
        double perimetro= 2*(tamanhoLado+ladoA);
        System.out.println("O perímetro do retângulo é : "  );
        return perimetro;
    }


}

import classes.Quadrado;

public class Ex5 {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        System.out.println("Tamanho do quadrado atual -> " + quadrado.tamanhoLado);
        System.out.println(quadrado.area(7));

        System.out.println( quadrado.ladoAlteracao(9));
        System.out.println( quadrado.area(7));

        }
    }

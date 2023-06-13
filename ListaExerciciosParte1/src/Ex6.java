import classes.Retangulo;

public class Ex6 {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        System.out.println("Tamanho do retângulo atual -> " + retangulo.tamanhoLado);
        System.out.println(retangulo.area(7));
        System.out.println( retangulo.perimetro(7));

        System.out.println( retangulo.ladoAlteracao(9));
        System.out.println( retangulo.area(7));
        System.out.println( retangulo.perimetro(7));

        }
    }

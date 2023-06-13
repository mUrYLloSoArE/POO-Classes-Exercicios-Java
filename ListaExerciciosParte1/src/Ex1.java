import classes.Bola;

public class Ex1 {
    public static void main(String[] args) {

        Bola bola = new Bola();
        bola.cor="Azul";
        bola.marca= "Nike";
        bola.material = "Borracha";
        bola.velocidade = 30;
        bola.circunferencia = 200;

        System.out.println("Informações da Bola : ");
        System.out.println("Marca -> " + bola.marca);
        System.out.println("Cor -> " + bola.cor);
        System.out.println("Material -> " + bola.material);
        System.out.println("Velocidade -> " + bola.velocidade + " KM/h ");
        System.out.println("Circunferência -> " + bola.circunferencia + " cm de diâmetro ");

        System.out.println();
        System.out.println(bola.alterarCor("Vermelha"));
        System.out.println(bola.mostrarCor());
        System.out.println();

        System.out.println("Informações da Bola Atualizadas : ");
        System.out.println("Marca -> " + bola.marca);
        System.out.println("Cor -> " + bola.cor);
        System.out.println("Material -> " + bola.material);
        System.out.println("Velocidade -> " + bola.velocidade + " KM/h ");
        System.out.println("Circunferência -> " + bola.circunferencia + " cm de diâmetro ");


    }
    }

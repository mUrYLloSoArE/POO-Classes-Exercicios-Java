import classes.Pessoa;

public class Ex2 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Muryllo Soares ",18,1.70);

        System.out.println("Dados da pessoa: ");
        System.out.println("Nome -> " + pessoa.nome);
        System.out.println("Idade -> " + pessoa.idade + " anos ");
        System.out.println("Peso -> " + pessoa.peso + " KG ");
        System.out.println("Altura -> " + pessoa.altura + " cm ");

        System.out.println();
        pessoa.engordar();

        System.out.println();
        pessoa.emagrecer();

        System.out.println();
        pessoa.envelhecer();

        System.out.println();
        pessoa.envelhecer();

        System.out.println();
        pessoa.envelhecer();

        System.out.println();
        pessoa.envelhecer();

        System.out.println();
        pessoa.crescer();

        System.out.println();
        pessoa.crescer();

       }
    }

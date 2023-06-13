
public class Jardim {
    public static void main(String[] args) {

        Jardinagem jardim= new Jardinagem();
        jardim.nomeJardim=" Campo Belo ";
        jardim.qtdPlantas= 100;
        jardim.qtdMetrosGramas =300;

        System.out.println("Informações sobre o jardim ");
        System.out.println("Nome do jardim-> " + jardim.nomeJardim);
        System.out.println("Mais de " + jardim.qtdPlantas + " plantações ");
        System.out.println(jardim.qtdMetrosGramas + " m² ");

        System.out.println("Quantidade de adubo a ser usado -> " + jardim.usarAdubo() + " KG ");
        System.out.println("Valor do Adubo -> " + " R$ " + jardim.precoAdubo());
        System.out.println("Valor para cortar a grama -> " + " R$ " + jardim.precoCorteGrama());

    }
}
public class Jardinagem {

    String nomeJardim;
    int qtdPlantas, qtdMetrosGramas;
    int gramaAdubo=100;
    double valorAdubo,valorCorteGrama,valorMetroGrama;

    public double  usarAdubo(){
      return (qtdMetrosGramas/2)*gramaAdubo;
    }

    public double precoAdubo(){
        valorAdubo=5.50;
        return valorAdubo*usarAdubo();
    }

    public double precoCorteGrama(){
        valorMetroGrama=3.50;
        valorCorteGrama= qtdMetrosGramas*valorMetroGrama;
        return valorCorteGrama;
    }

}

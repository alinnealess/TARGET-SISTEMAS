
package questao04;

public class questao4 {
  public static void main(String[] args) {
    double SP = 67836.43;
    double RJ = 36678.66;
    double MG = 29229.88;
    double ES = 27165.48;
    double Outros = 19849.53;

    double totalFaturamentoMensal = SP + RJ + MG + ES + Outros;
    double percentualSP = (SP / totalFaturamentoMensal) * 100;
    double percentualRJ = (RJ / totalFaturamentoMensal) * 100;
    double percentualMG = (MG / totalFaturamentoMensal) * 100;
    double percentualES = (ES / totalFaturamentoMensal) * 100;
    double percentualOutros = (Outros / totalFaturamentoMensal) * 100;

    for (int i = 0; i < 5; i++) {
      switch (i) {
        case 0:
          System.out.printf("O estado de SP representa %.2f %% do faturamento mensal.\n", percentualSP);
          break;
        case 1:
          System.out.printf("O estado de RJ representa %.2f %% do faturamento mensal.\n", percentualRJ);
          break;
        case 2:
          System.out.printf("O estado de MG representa %.2f %% do faturamento mensal.\n", percentualMG);
          break;
        case 3:
          System.out.printf("O estado de ES representa %.2f %% do faturamento mensal.\n", percentualES);
          break;
        case 4:
          System.out.printf("Os outros estados representam %.2f %% do faturamento mensal.\n", percentualOutros);
          break;
      }
    }
  }
}
package exercicios.faturamentoDistribuidora;

import java.text.DecimalFormat;
public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        Double faturamentoSP = 67836.43;
        Double faturamentoRJ = 36678.66;
        Double faturamentoMG = 29229.88;
        Double faturamentoES = 27165.48;
        Double demaisFaturamentos = 19849.53;
        Double somaFaturamentos = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + demaisFaturamentos;
        DecimalFormat df = new DecimalFormat("#,##0.00'%'");
        Double percentualSP = calcularPercentualFaturamento(faturamentoSP, somaFaturamentos);
        Double percentualRJ = calcularPercentualFaturamento(faturamentoRJ, somaFaturamentos);
        Double percentualMG = calcularPercentualFaturamento(faturamentoMG, somaFaturamentos);
        Double percentualES = calcularPercentualFaturamento(faturamentoES, somaFaturamentos);
        Double demaisFaturamentosPercentual = calcularPercentualFaturamento(demaisFaturamentos, somaFaturamentos);
        System.out.println("Percentual de SP: " + df.format(percentualSP));
        System.out.println("Percentual de RJ: " + df.format(percentualRJ));
        System.out.println("Percentual de MG: " + df.format(percentualMG));
        System.out.println("Percentual de ES: " + df.format(percentualES));
        System.out.println("Percentual de demais faturamentos: " + df.format(demaisFaturamentosPercentual));
    }
    public static Double calcularPercentualFaturamento(Double amostraFaturamento, Double somaFaturamento){
        return (amostraFaturamento / somaFaturamento) * 100;
    }
}



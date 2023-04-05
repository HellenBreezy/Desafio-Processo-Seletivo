package exercicios.faturamento;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraFaturamento {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./faturamentoDiario.json"));
        List<Double> faturamentosDiarios = (List<Double>) jsonObject.get("faturamentoDiario");

        faturamentosDiarios = faturamentosDiarios.stream().filter(faturamento -> faturamento > 0).collect(Collectors.toList());


        // Descobrir faturamento míninmo

        Double faturamentoMinimo = faturamentosDiarios.get(0);

        for (Double faturamento : faturamentosDiarios){
            if (faturamento < faturamentoMinimo){
                faturamentoMinimo = faturamento;
            }
        }

        // Descobrir faturamento máximo

        Double faturamentoMaximo = faturamentosDiarios.get(0);

        for (Double faturamento : faturamentosDiarios){
            if (faturamento > faturamentoMaximo){
                faturamentoMaximo = faturamento;
            }
        }

        // Descobrir faturamento médio e dias

        Double soma = 0.0;

        for (Double faturamento : faturamentosDiarios){
            soma = faturamento + faturamento;
        }
        double media = soma / faturamentosDiarios.size();

        int diasFaturamentosSuperioresAMedia = 0;

        for (Double faturamento : faturamentosDiarios){
            if (faturamento > media){
                 diasFaturamentosSuperioresAMedia++;

            }
        }

        System.out.println("O valor mínimo de faturamento foi: " + faturamentoMinimo);
        System.out.println("O valor máximo de faturamento foi: " + faturamentoMaximo);
        System.out.println("A média de faturamento foi: " + media);
        System.out.println("Dias em que o faturamento foi superior a média: " + diasFaturamentosSuperioresAMedia);
    }

}


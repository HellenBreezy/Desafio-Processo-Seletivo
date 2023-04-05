package exercicios.faturamento;

import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorFaturamento {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        List<Double> faturamentosAleatorios = gerarFaturamentosAleatorios(30);
        jsonObject.put("faturamentoDiario", faturamentosAleatorios);

        try (PrintWriter out = new PrintWriter(new FileWriter("./faturamentoDiario.json"))) {
            out.write(jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static List<Double> gerarFaturamentosAleatorios(Integer quantidade){
        List<Double> faturamentoDiario = new ArrayList<>();
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("0.00");


        for (int i = 0; i < quantidade ; i++){
            Double faturamentoAleatorio = Double.valueOf(df.format(random.nextDouble() * 1000).replace("," , "."));
            faturamentoDiario.add(faturamentoAleatorio);

        }

        return faturamentoDiario;
    }

}

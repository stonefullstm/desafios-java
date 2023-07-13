package segundo_desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;

public class Segundo {
    
    public static void main(String[] args) throws IOException {
        
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {0.50, 0.25, 0.10, 0.05, 0.01};
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("#.00", symbols);

        StringTokenizer st = new StringTokenizer(in.readLine(), ".");
        int inteiro = Integer.parseInt(st.nextToken());
        int decimal = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer("NOTAS:\n");
        for (int cedula: cedulas) {
          int qtde_cedulas = inteiro / cedula;
          inteiro = inteiro % cedula;
          sb.append(qtde_cedulas + " nota(s) de R$ " + df.format(cedula) + "\n");
        }
        sb.append("MOEDAS:\n");
        if (inteiro != 0) {
          sb.append("1 moeda(s) de R$ 1.00" + "\n");
        } else {
          sb.append("0 moeda(s) de R$ 1.00" + "\n");
        }
        for (double moeda: moedas) {
          int valor_moeda = (int) (moeda * 100);
          int qtde_moedas = decimal / valor_moeda;
          decimal = decimal % valor_moeda;
          sb.append(qtde_moedas + " moeda(s) de R$ " + moeda + "\n");
        }
        System.out.println(sb.toString());
    }
    
}

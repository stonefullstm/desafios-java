package quarto_desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quarto {

    public static StringBuffer inverte(char[] array) {
        StringBuffer sb = new StringBuffer("");
        for (int index = array.length - 1; index >= 0; index--) {
          sb.append(array[index]);
        }
        return sb;
    }

    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n;
        n = Integer.parseInt(in.readLine());
        List<String> linhas = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
          String linha = in.readLine();
          char[] texto = linha.toCharArray();
          int tamanho = texto.length;
          char[] first = Arrays.copyOfRange(texto, 0, tamanho / 2);
          char[] second = Arrays.copyOfRange(texto, tamanho / 2, tamanho);
          linhas.add(inverte(first).append(inverte(second)).toString());
        }
        for (String linha: linhas) {
          System.out.println(linha);
        }
    }
  
}

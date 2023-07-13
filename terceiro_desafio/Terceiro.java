package terceiro_desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Terceiro {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> lista = new ArrayList<Integer>();

        st = new StringTokenizer(in.readLine());
        while (st.hasMoreTokens()) {
          lista.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(lista);
        int contador = 0;
        for (int index = 0; index < n - 1; index++) {
          int sub_index = index + 1;
          while (sub_index <= n - 1 && lista.get(sub_index) <= lista.get(index) + k) {
            if (lista.get(sub_index) == lista.get(index) + k) {
              contador++;
            }
            sub_index++;
          }
        }
        System.out.println(contador);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Primeiro {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        List<Integer> lista = new ArrayList<Integer>();

        int n, m;
        n = Integer.parseInt(in.readLine());
        for (int i = 1; i <= n; i++) {
          String linha = in.readLine();
          m = Integer.parseInt(linha);
          if (m % 2 == 0) {
            lista.add(0, m);
          } else {
            lista.add(m);
          }
        }
        Collections.sort(lista, (Integer a, Integer b) -> {
          if (a % 2 == 0 && b % 2 == 0) {
            return Integer.compare(a, b);
          } else if (a % 2 == 1 && b % 2 == 1) {
            return Integer.compare(b, a);
          } else {
            return 0;
          }
        });
        for (Integer num: lista) {
          System.out.println(num);
        }
    }
    
}
package euler.exercicio7;


import java.util.ArrayList;
import java.util.List;

public class Exercicio7 {
    public static void main(String[] args) {
        List<Integer> primos = new ArrayList<>();
        int possiveis = 1000000000;

        for (int i = 1; i <= possiveis; i++) {
            boolean numeroPrimo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    numeroPrimo = false;
                    break;
                }
            }
            if (numeroPrimo) {
                primos.add(i);
            }
            if (primos.size() == 10002) {
                System.out.println("Numero primo 10.001 : " +primos.get(10001));
                System.exit(0);
            }
        }
    }
}

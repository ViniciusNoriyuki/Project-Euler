package euler.exercicio10;

import java.util.ArrayList;
import java.util.List;
public class Exercicio10 {
    private static List<Long> listaPrimo = new ArrayList<Long>();

    public static void main(String[] args) {
        long contador = 0;
        for (long i = 2; i < 2000000; i++) {
            if (numeroPrimo(i)) {
                contador += i;
            }
        }
        System.out.println("Total: " + contador);
    }

    public static boolean numeroPrimo(long numero) {
        String converterNumero = new Long(numero).toString();
        if ((converterNumero.length() != 1) && (converterNumero.endsWith("2") || converterNumero.endsWith("4") || converterNumero.endsWith("5") || converterNumero.endsWith("6") || converterNumero.endsWith("8"))) {
            return false;
        }

        for (Long num : listaPrimo) {
            if (num > Math.sqrt(numero)) {
                break;
            }
            if (numero % num.longValue() == 0) {
                return false;
            }
        }

        if(numero>0){
            listaPrimo.add(new Long(numero));
        }

        return true;
    }
}


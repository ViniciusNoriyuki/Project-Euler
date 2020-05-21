package euler.exercicio48;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Exercicio48 {
    public static void main(String[] args) {

        List<BigInteger> listaQuadrados = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO;
        int tam;
        for(Integer i = 1; i < 1000; i++) { //3^3 = 3 * 3 * 3

            BigInteger res = BigInteger.valueOf(i.intValue());
            for (int j = 1; j < i; j++){
                res = res.multiply(BigInteger.valueOf(i.intValue()));
            }

            tam = res.toString().length();
            if (tam == 1){
                listaQuadrados.add(new BigInteger(res.toString()));
            } else if (tam < 10){
                listaQuadrados.add(new BigInteger(res.toString().substring(0, tam)));
            } else {
                listaQuadrados.add(new BigInteger(res.toString().substring(tam - 10, tam)));
            }

            sum = sum.add(listaQuadrados.get(i - 1));
        }
        tam = sum.toString().length();
        String answer = sum.toString();
        System.out.println(answer.substring(tam - 10, tam));
    }
}

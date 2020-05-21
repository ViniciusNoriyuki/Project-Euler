package euler.exercicio25;

import java.math.BigInteger;

public class Exercicio25 {
    public static void main(String[] args) {
        BigInteger primeiro = BigInteger.valueOf(1);
        BigInteger segundo = BigInteger.valueOf(2);
        BigInteger terceiro = BigInteger.valueOf(1);
        BigInteger contador = BigInteger.valueOf(3);
        int maximo = 1000;
        BigInteger minimo = BigInteger.TEN.pow(maximo-1);

        while (terceiro.compareTo(minimo) < 0) {
            terceiro= primeiro.add(segundo);
            primeiro = segundo;
            segundo = terceiro;
            contador = contador.add(BigInteger.valueOf(1));
        }
        System.out.println("Posição do numero que possui 1000 casas decimais : "+contador);
    }
}

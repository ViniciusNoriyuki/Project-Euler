package euler.exercicio20;


import java.math.BigInteger;

public class Exercicio20 {
    public static void main(String[] args) {
        BigInteger resultado = new BigInteger("1");
        BigInteger soma = new BigInteger("0");
        BigInteger dez = new BigInteger("10");
        for (int i = 100; i > 1; i--) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Resultado fatoração : " +resultado);
        while(resultado.signum() > 0) {
            soma = soma.add(resultado.remainder(dez));
            resultado = resultado.divide(dez);
        }
        System.out.println("A soma dos algarismos é: " + soma);

    }
}

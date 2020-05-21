package euler.exercicio14;

public class Exercicio14 {
    public static void main(String[] args) {
        Long initial = 2L, highestInicial = 0L, longestChain = 0L;

        while (initial < 1000000){
            Long cont = 1L;
            Long aux = initial;

            while (aux != 1) {
                if (aux % 2 == 0) {
                    aux = aux / 2;
                    cont++;
                } else {
                    aux = (aux * 3) + 1;
                    cont++;
                }
            }
            if (cont > longestChain){
                longestChain = cont;
                highestInicial = initial;
            }
            initial++;
        }
        System.out.println(longestChain);
        System.out.println(highestInicial);
    }
}

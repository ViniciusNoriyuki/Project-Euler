package euler.exercicio27;

public class Exercicio27 {
    public static void main(String[] args) {
        int longestSequence = 0, res = 0;

        for (int a = -1000; a < 1000; a++) {
            for (int b = -1000; b < 1000; b++) {
                boolean isSequence = true;
                int n = 0;

                while (isSequence) {
                    int quadraticFormula = (n * n) + (a * n) + b;

                    if (quadraticFormula > 0 && isPrimeNumber(quadraticFormula)) {
                        n++;
                    } else {
                        isSequence = false;
                    }

                    if (n >= longestSequence) { //max number of primes for consecutive values of n
                        longestSequence = n;
                        res = a * b;
                    }
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isPrimeNumber(long number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}

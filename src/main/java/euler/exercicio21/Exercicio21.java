package euler.exercicio21;

public class Exercicio21 {
    public static void main(String[] args) {
        int res = 0;

        for (int num1 = 1; num1 <= 10000; num1++){
            int sum1 = 0, sum2 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sum1 = sum1 + i;
                }
            }
            for (int i = 1; i < sum1; i++) {
                if (sum1 % i == 0) {
                    sum2 = sum2 + i;
                }
            }
            if ((num1 == sum2) && (num1 != sum1)){
                res = res + num1;
            }
        }
        System.out.println(res);
    }
}

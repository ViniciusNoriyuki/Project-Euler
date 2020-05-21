package euler.exercicio6;

public class Exercicio6 {
    public static void main(String[] args) {
        double sum_squares = 0D, sum = 0D;
        long squares_sum;

        for (int i = 1; i <= 100; i++){
            sum_squares += Math.pow(i, 2);
            sum += i;
        }
        squares_sum = (long) Math.pow(sum, 2);
        long res = (long) (squares_sum - sum_squares);

        System.out.println(res);
    }
}

package euler.exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
        long num = 600851475143L;

        for(long i = 2; i < num; ++i) {
            if(num % i == 0) {
                num = num / i;
            }
        }

        System.out.println(num);
    }
}

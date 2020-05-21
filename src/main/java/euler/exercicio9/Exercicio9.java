package euler.exercicio9;

public class Exercicio9 {
    public static void main(String[] args) {
        int sum = 1000;

        for (int a = 1; a < sum; a++){
            for (int b = a + 1; b < sum; b++){
                for (int c = b + 1; c < sum; c++){
                    if ((a * a + b * b == c * c) && (a + b + c == sum)){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);

                        int res = a * b * c;
                        System.out.println(res);
                    }
                }
            }
        }
    }
}

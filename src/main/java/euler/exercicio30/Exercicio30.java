package euler.exercicio30;

public class Exercicio30 {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 2; i <= 1000000; i++){ //1^5 is not a sum included
            if (i == fifthPower(i)){
                System.out.println(i);
                res = res + i;
            }
        }
        System.out.println(res);
    }

    private static int fifthPower(int number){
        char[] digitos = String.valueOf(number).toCharArray();
        int res = 0;

        for (char d : digitos) {
            int x = Character.getNumericValue(d);
            int power = x * x * x * x * x;
            res = res + power;
        }
        return res;
    }
}

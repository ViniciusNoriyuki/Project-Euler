package euler.exercicio12;

public class Exercicio12 {
    public static void main(String[] args) {
        Boolean flag = false;
        int sum = 0, i = 1, cont = 0;

        while (!flag){
            sum = sum + i;
            for(int j = 1; j <= sum; ++j) {
                if(sum % j == 0) {
                    cont++;
                    if (cont == 500){
                        flag = true;
                    }
                }
            }
            cont = 0;
            i++;
        }

        System.out.println(sum);
    }
}

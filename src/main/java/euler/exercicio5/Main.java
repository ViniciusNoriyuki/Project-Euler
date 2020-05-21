package exercicio5;

public class Main {
    public static void main(String[] args) {
        Long smallest = 0L;
        Long i;
        for (Long j = 1L; j < 1000000000L; j++) {
            for (i = 1L; i <= 20L; i++) {
                if (j % i != 0) {
                    break;
                }
            }
            if(i==21){
                smallest = j;
                break;
            }
        }
        System.out.println(smallest);
    }
}

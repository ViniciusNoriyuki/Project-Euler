package euler.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        List<Integer> multiplos = new ArrayList<Integer>();
        for(int i=1;i<1000;i++){
            if(i % 3 == 0 || i % 5 ==0){
                multiplos.add(i);
            }
        }

        int soma = multiplos
                .stream()
                .mapToInt(i -> i.intValue())
                .sum();

        System.out.println(soma);
    }
}

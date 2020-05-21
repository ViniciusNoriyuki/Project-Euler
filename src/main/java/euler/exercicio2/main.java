package exercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int somaNumPar = 0;
        for (int qtd = 34; qtd > 0; qtd--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            if(n3 % 2 == 0){
                somaNumPar+=n3;
            }
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");
        System.out.println(somaNumPar);
    }
}

package euler.exercicio28;

public class Exercicio28 {
    public static void main(String[] args) {
        //Nao completo!!!
        long matriz[][] = new long[5][5];
        int contador = 25;
        int i=0,j;
        int verificado =0 ;

        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                matriz[i][j] = contador;
                contador--;
            }
        }

//        for(i=0;i<5;i++){
//            for(j=0;j<5;j++){
//                System.out.print("-"+matriz[i][j]);
//            }
//            System.out.println();
//        }
    }
}

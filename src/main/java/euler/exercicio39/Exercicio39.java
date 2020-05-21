package euler.exercicio39;

public class Exercicio39 {
    public static void main(String[] args) {
        //a + b + c = p , p <= 1000
        //a * a + b * b = c * c
        //a < b < c
        int solutionsMaximised = 0, res = 0;
        for (int perimeter = 1; perimeter <= 1000; perimeter++){
            int cont = 0;
            for (int a = 1; a < perimeter; a++){
                for (int b = a + 1; b < perimeter; b++){
                    for (int c = b + 1; c < perimeter; c++){
                        if ((a + b + c == perimeter) && (a * a) + (b * b) == (c * c)){
                            cont++;
                            System.out.println(perimeter);
                        }
                    }
                }
            }
            if (cont > solutionsMaximised){
                solutionsMaximised = cont;
                res = perimeter;
            }
        }
        System.out.println(res);
    }
}

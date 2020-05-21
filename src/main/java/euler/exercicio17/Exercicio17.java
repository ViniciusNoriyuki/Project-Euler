package euler.exercicio17;

public class Exercicio17 {
    public static void main(String[] args) {
        String palavraAtual;
        int soma = 0;
        for(int i =1;i<=1000;i++){
            palavraAtual = numeroParaPalavra(i);
            soma += palavraAtual.length();
        }

        System.out.println("Total: " + soma);
    }

    private static String numeroParaPalavra(int numero) {
        String palavra = "";
        String numeros[] = { "","one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String numerosDecimais[] = { "", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        boolean verificador = false;

        if ((numero / 1000) > 0) {
            palavra += numeroParaPalavra(numero / 1000) + "thousand";
            numero %= 1000;
        }

        if(numero == 100 || numero == 200 || numero == 300 || numero == 400 || numero == 500 || numero == 600 || numero == 700 || numero == 800 || numero == 900){
            verificador = true;
            palavra += numeroParaPalavra(numero / 100) + "hundred";
            numero %= 100;
        }

        if ((numero / 100) > 0 && verificador == false) {
            palavra += numeroParaPalavra(numero / 100) + "hundredand";
            numero %= 100;
        }

        if (numero > 0) {
            if (numero < 20) {
                palavra += numeros[numero];
            } else {
                palavra += numerosDecimais[numero / 10];
                if ((numero % 10) > 0) {
                    palavra += numeros[numero % 10];
                }
            }
        }
        return palavra;
    }
}

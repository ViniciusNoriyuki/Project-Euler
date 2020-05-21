package euler.exercicio36;

public class Exercicio36 {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 1; i < 1000000; i++){
            String binario = Integer.toBinaryString(i);
            if (isPalindromeNumber(i) && isPalindromeBinary(binario)){
                System.out.printf("Number %d and your binary %s is palindrome\n", i, binario);
                res = res + i;
            }
        }
        System.out.println(res);
    }

    private static boolean isPalindromeBinary(String binary){
        int tam = binary.length();
        if (tam == 1 && (binary.charAt(0) == '0' || binary.charAt(0) == '1')){
            return true;
        }
        int aux = binary.length() - 1, parada = binary.length() / 2, cont = 0;

        for (int i = 0; i < parada; i++){
            if (binary.charAt(i) == binary.charAt(aux)){
                cont++;
            }
            aux--;
            if (cont == parada){
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindromeNumber(int number){
        char[] digitos = String.valueOf(number).toCharArray();
        int aux = digitos.length - 1, parada = digitos.length / 2, cont = 0;

        for (int i = 0; i < 10; i++){
            if (number == i){
                return true;
            }
        }

        for (int i = 0; i < parada; i++){
            if (digitos[i] == digitos[aux]){
                cont++;
            }
            aux--;
            if (cont == parada){
                return true;
            }
        }
        return false;
    }
}

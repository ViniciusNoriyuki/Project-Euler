package euler.exercicio34;

public class Exercicio34 {
    public static void main(String[] args) {
        String numeroInicial = "";
        String numeroFinal = "";
        boolean verificador= false;
        int contador = 1;
        String contadorString;
        long soma;
        long somaNumeros = 0;

        while (verificador == false){
            contadorString = String.valueOf(contador);
            soma = 0;

            for(int i=0;i<contadorString.length();i++) {
                char letra = contadorString.charAt(i);
                int letraParaNumero = Integer.parseInt(String.valueOf(letra));
                soma += calculaFatorial(letraParaNumero);
            }

            numeroFinal = String.valueOf(soma);
            numeroInicial = String.valueOf(contador);

            if(numeroFinal.equals(numeroInicial)){
                somaNumeros += soma;
                System.out.println("Resultado : ");
                System.out.println(somaNumeros -3);
            }
            
            contador++;
        }
    }

    static Integer calculaFatorial(int numero) {
        int resultado=1;
        for (int i = numero; i > 0; i--) {
            resultado = resultado * (i);
        }
        return resultado;
    }
}

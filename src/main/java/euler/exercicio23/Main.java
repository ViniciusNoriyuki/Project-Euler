package exercicio23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Double somaDosValores = 0D;
        Boolean existe = false;
        int l;
        ArrayList<Integer> listaNumerosAbundantes = new ArrayList<Integer>();
        Set<Integer> listaSomaNumerosAbundantes = new HashSet<Integer>();
        for (int i = 0; i < 28123; i++) {
            if (verificarNumeroPerfeito(i) == 2) {
                listaNumerosAbundantes.add(i);
            }
        }

        for (int k = 0; k < listaNumerosAbundantes.size(); k++) {
            for (Integer listaNumerosAbundante : listaNumerosAbundantes) {
                if(listaNumerosAbundante + listaNumerosAbundantes.get(k)>28123){
                    break;
                }
                listaSomaNumerosAbundantes.add(listaNumerosAbundante + listaNumerosAbundantes.get(k));
            }
        }
        System.out.println(listaSomaNumerosAbundantes.size());
//        ArrayList<Integer> listaAux = new ArrayList<Integer>(listaSomaNumerosAbundantes);
//        System.out.println(listaAux.get(listaAux.size()-1));

        for(l=24;l<28123;l++){
            for(Integer somaAbundantes: listaSomaNumerosAbundantes){
                if(somaAbundantes==l){
                    existe=true;
                    break;
                }
                else {
                    existe=false;
                }
            }
            if(existe==false){
                somaDosValores+=l;
            }
        }
        System.out.println(somaDosValores);
    }
    private static int verificarNumeroPerfeito(Integer numero){
        Integer soma = 0;
        for(int i = 1 ; i < numero ; i++) {
            if(numero % i == 0)  {
                soma = soma + i;
            }
        }
        if (soma.equals(numero)) {
            //System.out.format("\n% d is a Perfect Number", numero);
            return 0;
        }
        else if(soma<numero) {
            //System.out.format("\n% d is a Deficient Number", numero);
            return 1;
        }
        else if(soma>numero) {
            //System.out.format("\n% d is a Abundant Number", numero);
            return 2;
        }
        return -1;
    }
}

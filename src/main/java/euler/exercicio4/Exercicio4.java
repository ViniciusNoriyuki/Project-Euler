package euler.exercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> listaPalindromos = new ArrayList<Integer>();
        for(int i = 100;i<1000;i++){
            for(int j = 100;j<1000;j++){
                if(verificarPalindromo(i*j)){
                    listaPalindromos.add(i*j);
                }
            }
        }
        Collections.sort(listaPalindromos);
        System.out.println(listaPalindromos.get(listaPalindromos.size()-1));
    }
    private static Boolean verificarPalindromo(Integer numero){
        Integer sum = 0;
        Integer resto = 0;
        Integer temp=numero;
        while(numero>0){
            resto=numero%10;
            sum=(sum*10)+resto;
            numero=numero/10;
        }
        if(temp.equals(sum)) {
            return true;
        }
        else {
            return false;
        }
    }
}


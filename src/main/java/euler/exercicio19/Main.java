package exercicio19;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        int qntDomingos = 0;
        int anoAtual = 1900;
        ArrayList<String> diasDaSemana = new ArrayList<String>();
        diasDaSemana.add("Segunda-feira");
        diasDaSemana.add("Terca-feira");
        diasDaSemana.add("Quarta-feira");
        diasDaSemana.add("Quinta-feira");
        diasDaSemana.add("Sexta-feira");
        diasDaSemana.add("Sabado");
        diasDaSemana.add("Domingo");
        ListIterator<String> diasDaSemanaIterator = diasDaSemana.listIterator();
        String diaDaSemana;
        while (anoAtual!=2001) {
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
                System.out.println(i + " de Janeiro | " + diaDaSemana + " de " + anoAtual);
            }
            for (int i = 1; i <= 28; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Fevereiro | " + diaDaSemana + " de " + anoAtual);

                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
                if (anoAtual % 4 == 0 && anoAtual % 100 != 0 && i == 28) {
                    if(diaDaSemana.compareTo("Domingo") == 0){
                        diasDaSemanaIterator = diasDaSemana.listIterator();
                    }
                    diaDaSemana = diasDaSemanaIterator.next();
                    System.out.println(i+1 + " de Fevereiro | " + diaDaSemana + " de " + anoAtual);
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Marco | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 30; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Abril | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Maio | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 30; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Junho | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Julho | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Agosto | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 30; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Setembro | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Outubro | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 30; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Novembro | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            for (int i = 1; i <= 31; i++) {
                if(!diasDaSemanaIterator.hasNext()) {
                    diasDaSemanaIterator = diasDaSemana.listIterator();
                }
                diaDaSemana = diasDaSemanaIterator.next();
                System.out.println(i + " de Dezembro | " + diaDaSemana + " de " + anoAtual);
                if (i == 1 && diaDaSemana.compareTo("Domingo") == 0 && anoAtual!=1900) {
                    qntDomingos++;
                }
            }
            anoAtual++;
        }
        System.out.println("Quantidade de domingos" + qntDomingos);
    }
}

package euler.exercicio22;


import java.io.*;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio22 {
    public static void main(String[] args) throws IOException {
        List<String> nomes = lerArquivoTxt();

        nomes = separarIndices(nomes);

        nomes = ordenarPorOrdemAlfabetica(nomes);

        BigInteger resultado = new BigInteger("0");

        resultado = resultado.add(posicaoLetra(nomes));

        System.out.println("Resultado : "+resultado);
    }

    private static List<String> ordenarPorOrdemAlfabetica(List<String> nomes) {
        List<String> ordemAlfabetica = nomes
                .stream()
                .sorted(Comparator.comparing(n -> n))
                .collect(Collectors.toList());

        return ordemAlfabetica;
    }

    private static List<String> separarIndices(List<String> nomes) {
        List<String> listaFormatada;
        String[] str = nomes.get(0).split(",");

        listaFormatada = Arrays.asList(str);

        return listaFormatada;
    }

    private static List<String> lerArquivoTxt() throws IOException {
        List<String> list = Files.readAllLines(new File("names.txt").toPath(), Charset.defaultCharset() );

        return list;
    }

    static BigInteger posicaoLetra(List<String> nomes) {
        BigInteger valorLetra = new BigInteger("0");
        BigInteger resultado = new BigInteger("0");
        BigInteger posicaoPalavra = new BigInteger("0");
        int indicePalavra = 1;
        int valorBusca = 0 ;
        for(String nome : nomes){
            for(int i=0;i < nome.length();i++){
                char letraBusca = nome.charAt(i);
                String letra = Character.toString(letraBusca);
                 valorBusca += buscarLetra(letra);
                 valorLetra = BigInteger.valueOf(valorBusca);
            }
            posicaoPalavra = BigInteger.valueOf(indicePalavra);
            resultado = resultado.add(valorLetra.multiply(posicaoPalavra));
            indicePalavra++;
            valorBusca = 0;
            valorLetra = BigInteger.ZERO;
        }
        return resultado;
    }

    static Integer buscarLetra(String busca){
        List<String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");
        letras.add("G");
        letras.add("H");
        letras.add("I");
        letras.add("J");
        letras.add("K");
        letras.add("L");
        letras.add("M");
        letras.add("N");
        letras.add("O");
        letras.add("P");
        letras.add("Q");
        letras.add("R");
        letras.add("S");
        letras.add("T");
        letras.add("U");
        letras.add("V");
        letras.add("W");
        letras.add("X");
        letras.add("Y");
        letras.add("Z");
        letras.add("");

        for(int i=0;i<letras.size();i++){
            if(letras.get(i).equals("")){
                return 0;
            }
            if(letras.get(i).equals(busca)){
                return i + 1;
            }
        }
        return null;
    }

}


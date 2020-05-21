package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class NumeroEProduto {
    private String numerosConcatenados;
    private Integer produtoDosNumeros;
    private Long produtoDosNumerosLong;
    private DirecaoNumeros direcaoNumeros;

    public NumeroEProduto(String numerosConcatenados, Long produtoDosNumero){
        this.numerosConcatenados = numerosConcatenados;
        this.produtoDosNumerosLong = produtoDosNumero;
    }
    public NumeroEProduto(String numerosConcatenados, Integer produtoDosNumeros, DirecaoNumeros direcaoNumeros){
        this.numerosConcatenados = numerosConcatenados;
        this.produtoDosNumeros = produtoDosNumeros;
    }
    public static void ordenarListaInteger(List<NumeroEProduto> listaNumeroProduto) {
        int i;
        for(i = 0; i<listaNumeroProduto.size(); i++){
            for(int j = 0; j<listaNumeroProduto.size()-1; j++){
                if(listaNumeroProduto.get(j).getProdutoDosNumeros() > listaNumeroProduto.get(j+ 1).getProdutoDosNumeros()){
                    NumeroEProduto aux = listaNumeroProduto.get(j);
                    listaNumeroProduto.set(j, listaNumeroProduto.get(j+1));
                    listaNumeroProduto.set(j + 1, aux);
                }
            }
        }
    }

    public static void ordenarListaLong(List<NumeroEProduto> listaNumeroProduto) {
        int i;
        for(i = 0; i<listaNumeroProduto.size(); i++){
            for(int j = 0; j<listaNumeroProduto.size()-1; j++){
                if(listaNumeroProduto.get(j).getProdutoDosNumerosLong() > listaNumeroProduto.get(j+ 1).getProdutoDosNumerosLong()){
                    NumeroEProduto aux = listaNumeroProduto.get(j);
                    listaNumeroProduto.set(j, listaNumeroProduto.get(j+1));
                    listaNumeroProduto.set(j + 1, aux);
                }
            }
        }
    }
}

package aula06_pesquisa_ordenacao;

import aula02_complexidade_algoritmos.MergeSort;
import utils.ArrayUtils;

public class BuscaBinaria {
    //Implemente um método recursivo que faça uma busca binária em um array de inteiros ordenado

    public static void main(String[] args) {
        //int[] a = {5, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] a = new int[1_000];
        ArrayUtils.preencherArrayComValoresInteirosAleatorios(a, 10_000, false);
        MergeSort ms = new MergeSort();
        ms.ordenar(a);
        boolean b = buscaBinariaNaoRecursiva(a, 68);
        System.out.printf("%n%b",b);
    }
    public static boolean buscaBinariaNaoRecursiva(int[] arranjo, int chave) {
        //verifica se um inteiro esta no arranjo ordenado
        //exemplo:   [ 30  40  50  60  70 ]
        //          i   0   1   2   3   4
        int inicio = 0;
        int fim = arranjo.length-1;

        ArrayUtils.imprimirComPosicao(arranjo);
        System.out.printf("%n");
        System.out.printf("%n| chave |inicio | meio  | fim   |resultado|");
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            System.out.printf("%n|%7d|%3d %3d|%3d %3d|%3d %3d|%9s", chave, inicio, arranjo[inicio], meio, arranjo[meio], fim, arranjo[fim],(chave==arranjo[meio]));
            if(chave<arranjo[meio]) fim = meio -1;
            else if(chave>arranjo[meio]) inicio = meio + 1;
            else return true;
        }
        return false;
    }
}

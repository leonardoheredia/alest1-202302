package aula02_complexidade_algoritmos;

import utils.ArrayUtils;

import java.util.Random;

public class BuscaEmArray {

    private static int operacoes;
    public static void main(String[] args) {
        int TAMANHO_LISTA = 1_000;
        int[] arrayNumeros = new int[TAMANHO_LISTA];
        int[] arrayNumerosOrdenado = new int[TAMANHO_LISTA];
        ArrayUtils.preencherArrayComValoresInteirosAleatorios(arrayNumeros, 1000, true);
        ArrayUtils.clonarArray(arrayNumeros, arrayNumerosOrdenado);

        MergeSort ms = new MergeSort();
        ms.ordenar(arrayNumerosOrdenado);


        Random geradorRandomico = new Random();

        int QTD_TESTES = 500;
        int[] arrayTestesNaoOrdenado = new int[QTD_TESTES];
        int[] arrayTestesOrdenado = new int[QTD_TESTES];
        int[] arrayTestesOrdenadoBuscaBinaria = new int[QTD_TESTES];


        for (int i = 0; i < QTD_TESTES; i++) {
            int numero = geradorRandomico.nextInt(1000);

            existeNoArray(arrayNumeros, numero);
            arrayTestesNaoOrdenado[i] = operacoes;

            existeNoArrayOrdenado(arrayNumerosOrdenado, numero);
            arrayTestesOrdenado[i] = operacoes;

            existeNoArrayUsandoBuscaBinaria(arrayNumerosOrdenado, numero);
            arrayTestesOrdenadoBuscaBinaria[i] = operacoes;

            //System.out.printf("\nPesquisando numero %d --> %b - %d operacoes realizadas", numero, existeNoArray(arrayNumeros, numero), operacoes);
            //System.out.printf("%n%d;%d;%d",arrayTestesNaoOrdenado[i],arrayTestesOrdenado[i],arrayTestesOrdenadoBuscaBinaria[i]);

            //System.out.printf("%n%d;%d",arrayTestesNaoOrdenado[i],arrayTestesOrdenado[i]);
            System.out.printf("%n%d",arrayTestesNaoOrdenado[i]);


        }


       // for (int i = 0; i < QTD_TESTES; i++) System.out.println(arrayTestes[i]);

    }
    public static boolean existeNoArray(int[] array, int numero) {
        operacoes = 0;
        for (int i = 0; i < array.length; i++) {
            if(numero==array[i]) return true;
            operacoes++;
        }
        return false;
    }


    public static boolean existeNoArrayOrdenado(int[] array, int numero) {
        operacoes = 0;
        for (int i = 0; i < array.length; i++) {
            if(numero==array[i]) return true;
            if(numero < array[i]) return false;
            operacoes++;
        }
        return false;
    }

    public static boolean existeNoArrayUsandoBuscaBinaria(int[] arrayOrdenado, int valorPesquisado) {
        operacoes = 0;

        int inicio = 0;
        int fim = arrayOrdenado.length - 1;

        while(inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if(valorPesquisado < arrayOrdenado[meio]) { //o meio eh menor que o valor pesquisado, move para a esquerda no array
                fim = meio - 1;
            }
            else if(valorPesquisado > arrayOrdenado[meio]) {
                inicio = meio + 1;
            }
            else {
                return true;
            }
            operacoes++;
        }
        return false;
    }

}

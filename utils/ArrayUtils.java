package utils;

import java.util.Random;

public class ArrayUtils {


    public static void imprimir(int[] variavelArray) {
        System.out.printf("[");
        for (int i = 0; i < variavelArray.length ; i++) {
            System.out.printf(" %d ", variavelArray[i]);
        }
        System.out.printf("]%n");
    }
    public static void preencherArrayComValoresInteirosAleatorios(int[] variavelArray, int limiteSuperior, boolean permitirRepetidos) {
        Random geradorRandomico = new Random();
        for (int i = 0; i < variavelArray.length; i++) {
            int valorGerado = geradorRandomico.nextInt(limiteSuperior);
            if(permitirRepetidos) variavelArray[i] = valorGerado;
            else {
                while (valorExisteNoArray(variavelArray, valorGerado)) {
                    valorGerado = geradorRandomico.nextInt(limiteSuperior);
                }
                variavelArray[i] = valorGerado;
            }
        }
    }

    public static boolean valorExisteNoArray(int[] arrayInteiro, int valor) {
        boolean achou = false;
        int i = 0;
        while (!achou && i<arrayInteiro.length) {
            if(arrayInteiro[i] == valor) achou=true;
            i++;
        }
        return achou;
    }

    public static void clonarArray(int[] arrayInteiroOrigem, int[] arrayInteiroDestino) {
        for (int i = 0; i < arrayInteiroOrigem.length; i++) {
            arrayInteiroDestino[i] = arrayInteiroOrigem[i];
        }
    }
}

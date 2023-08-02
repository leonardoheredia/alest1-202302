package utils;

public class ArrayUtils {
    public static void imprimir(int[] variavelArray) {
        System.out.printf("[");
        for (int i = 0; i < variavelArray.length ; i++) {
            System.out.printf(" %d ", variavelArray[i]);
        }
        System.out.printf("]%n");
    }

}

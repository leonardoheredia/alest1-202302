package aula05_recursao_exercicios;

import utils.ArrayUtils;

public class InverteArray {
    //Implemente um método recursivo em Java que inverta um array de inteiros de tamanho n
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        ArrayUtils.imprimirComPosicao(a);
        inverterArrayRecursivamente(a, a.length-1);
        ArrayUtils.imprimirComPosicao(a);
    }
    public static void inverteArray(int[] a) {
        int tamanho = a.length;
        for (int i = tamanho-1; i > (tamanho-1)/2 ; i--) {
            int temp = a[tamanho-i-1];
            a[tamanho-i-1] = a[i];
            a[i] = temp;
        }
    }
    public static void inverterArrayRecursivamente(int[] a, int i) {
        int tamanho = a.length;
        if(i>((tamanho-1)/2)) {
            int temp = a[tamanho - i - 1];
            a[tamanho - i - 1] = a[i];
            a[i] = temp;
            inverterArrayRecursivamente(a, i - 1);
        }
    };
}
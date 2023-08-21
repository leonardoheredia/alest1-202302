package aula05_recursao_respostas;

import utils.ArrayUtils;

public class InverteArray {
    //Implemente um método recursivo em Java que inverta um array de inteiros de tamanho n
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        inverterArrayNaoRecursivo(a);
        System.out.println("Recursivamente");
        int[] b = {10, 20, 30, 40};
        inverterArrayRecursivo(b, 0);
    }
    public static void inverterArrayNaoRecursivo(int[] arranjo) {
        int n = arranjo.length;
        for (int i = 0; i < n/2; i++) {
            ArrayUtils.imprimir(arranjo);
            int temp = arranjo[i];
            arranjo[i] = arranjo[n-1-i];
            arranjo[n-1-i] = temp;
        }
        ArrayUtils.imprimir(arranjo);
    }
    public static void inverterArrayRecursivo(int[] arranjo, int p) {
        int n = arranjo.length;
        if(p<n/2) {
            ArrayUtils.imprimir(arranjo);
            int temp = arranjo[p];
            arranjo[p] = arranjo[n-1-p];
            arranjo[n-1-p] = temp;
            inverterArrayRecursivo(arranjo, p+1);
        }
        else ArrayUtils.imprimir(arranjo);
    }
}

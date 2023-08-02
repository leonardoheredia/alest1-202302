package aula01_exercicios_revisao;

import utils.ArrayUtils;

public class ExerciciosRevisao {

    public static void main(String[] args) {
        System.out.println(ex01_stringInteiros0n(5));
        ArrayUtils.imprimir(ex02_arrayInteiros0n(10));

        System.out.println("Testa se o número é primo:");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " - " + ex03_EhPrimo(i));
        }

        System.out.println("Primos entre 1 e 100:");
        ArrayUtils.imprimir(ex04_PrimosEntreDoisNumeros(1, 100));

        int[] l = {1, 3, 4, 4, 4, 2, 6, 9, 3};
        System.out.println(ex05_nOcorrencias(l, 3));

    }
    public static String ex01_stringInteiros0n(int n) {
         String s = "";
         for (int i = 0; i <=n; i++) {
             s = s + " " + i;
         }
         return s;
     }

     //2) Receba um inteiro n e retorne um array com todos os inteiros de 0 até n;
    public static int[] ex02_arrayInteiros0n(int n) {
        int[] a = new int[n+1];
        for (int i = 0; i <= n; i++) {
            a[i] = i;
        }
        return a;
    }

    //3) Receba um número e retorne true se este número for primo, false caso contrário;
    public static boolean ex03_EhPrimo(int numero) {
        //numero primo é divisível apenas por 1 e pelo próprio número
        //implementacao simples é dividir por todos os números de 1 até o próprio número, se tiver mais que dois divisores nao eh primo
        int divisores = 0;
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0) divisores++;
        }
        if(divisores==2) return true;
        else return false;
    }

    //4) Receba dois inteiros e retorne um array com todos os primos entre estes números.
    public static int[] ex04_PrimosEntreDoisNumeros(int numero1, int numero2) {
        int capacidadeMaxima = numero2 - numero1;
        int[] arrayTemporario = new int[capacidadeMaxima];
        int iTemporario = 0;
        for (int i = numero1; i <= numero2 ; i++) {
            if(ex03_EhPrimo(i)) {
                arrayTemporario[iTemporario] = i;
                iTemporario++;
            }
        }
        int quantidadePrimos = iTemporario;
        int[] arrayFinal = new int[quantidadePrimos];
        for (int i = 0; i < quantidadePrimos; i++) {
            arrayFinal[i] = arrayTemporario[i];
        }
        return arrayFinal;
    }

    //5) Método que retorna quantas ocorrências de um elemento em um array.
    public static int ex05_nOcorrencias(int[] l, Integer el) {
        int ocorrencias = 0;
        for (int i = 0; i < l.length; i++) {
            if(l[i]==el) ocorrencias++;
        }
        return ocorrencias;
    }
}

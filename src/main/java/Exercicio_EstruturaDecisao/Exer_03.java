/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_EstruturaDecisao;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Exer_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 10; // tamanho dos vetores
        int a[] = new int[n]; // declarando os vetores de nros inteiros "a", "b" e "c" de tamanho "n"
        int b[] = new int[n];
        int c[] = new int[n];
        int i; // indice (ou posicao)

        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %2do. elemento de %d do vetor 'a': ", (i + 1), n);
            a[i] = ler.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %2do. elemento de %d do vetor 'b': ", (i + 1), n);
            b[i] = ler.nextInt();
        }

        for (i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }

        System.out.printf("\n\ni- a[i]   b[i]   c[i] = a[i] - b[i]\n");
        System.out.printf("===================================\n");
        for (i = 0; i < n; i++) {
            System.out.printf("%d- %4d   %4d   %4d\n", i, a[i], b[i], c[i]);
        }
        System.out.printf("===================================\n");
    }

}

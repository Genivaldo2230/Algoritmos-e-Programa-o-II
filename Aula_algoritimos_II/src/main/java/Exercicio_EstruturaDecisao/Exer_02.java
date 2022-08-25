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
public class Exer_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[5];
        
        System.out.println("vetor 1 ");
        vetor[0] = sc.nextInt();
        System.out.println("vetor 2 ");
        vetor[1] = sc.nextInt();
        System.out.println("vetor 3 ");
        vetor[2] = sc.nextInt();
        System.out.println("vetor 4 ");
        vetor[3] = sc.nextInt();
        System.out.println("vetor 5 ");
        vetor[4] = sc.nextInt();
        System.out.println("Vetor Selecionado : "+vetor[2]);
    }
    
    
}

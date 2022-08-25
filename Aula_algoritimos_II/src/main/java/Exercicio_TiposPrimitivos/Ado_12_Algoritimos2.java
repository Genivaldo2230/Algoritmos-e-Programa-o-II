/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que receba como entrada do usuário um número inteiro
 * e devolva como saída esse mesmo número divido por 3 e multiplicado por 10.
 *
 * @author gda_a
 */
public class Ado_12_Algoritimos2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite Numeros ; ");

        int num1 = sc.nextInt();
        System.out.println("Numero Digitado : " + num1);
        
        int num2=3;
        int divisao;
        divisao = num1 / num2;
        System.out.println("Resposta divisao : "+divisao);
        System.out.println("Resposta da Divisao sera Meltiplicado por 10");
        
        int num4 = 10;
        int mult;
        mult = divisao * num4;
        System.out.println("Resposta da Multiplicação : "+ mult);
        
        
    }
}

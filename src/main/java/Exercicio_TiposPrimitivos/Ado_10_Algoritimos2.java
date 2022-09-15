/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que receba como entrada do usuário um número inteiro e devolva como saída esse mesmo número acrescido de 2.
 * @author gda_a
 */
public class Ado_10_Algoritimos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("um número inteiro e devolva como saída esse mesmo número acrescido de 2");
        
        int numA = sc.nextInt();
        System.out.println("Digite Primeiro Nº ");
       
        int numB = 2;
        int soma = numA + 2;
        System.out.println("Resposta "+soma);
               
    }
    
}

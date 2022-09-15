/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 *  Realize e exiba a divisão de dois números inteiros (Obs: pode utilizar dois números fixos)
 * @author gda_a
 */
public class Ado_3_Algoritimos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digtte Primeiro Nº: ");
        int num1 = sc.nextInt();
        
        System.out.println("Digite Segundo  Nº:  \n Dividindo Por ");
        int num2 = sc.nextInt();
        
        System.out.println("Resultado Da Divisão");
        int divisao;
        divisao = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Resultado : " + divisao);
        System.out.println("Resto " + resto);
    }
    
}

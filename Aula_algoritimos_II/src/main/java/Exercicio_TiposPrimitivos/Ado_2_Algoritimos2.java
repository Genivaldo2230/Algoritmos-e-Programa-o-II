/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 *Realize e exiba a multiplicação de dois números inteiros (Obs: pode utilizar dois números fixos)
 * @author gda_a
 */
public class Ado_2_Algoritimos2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite Primeiro Nº: ");
        int num1 = sc.nextInt();
        
        System.out.println("Digite Segundo  Nº: ");
        int num2 = sc.nextInt();
        
        int multiplicador;
        multiplicador = num1 * num2;
        
        System.out.println("O Resultado é : "+ multiplicador);


    
    }
    
}

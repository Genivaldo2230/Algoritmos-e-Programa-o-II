/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 * Imagine o seguinte problema fictício: A nota final de laboratório é calculada
 * pela média das notas N1, N2 e N3. Resolva esse problema, sendo que as notas
 * serão entradas informadas pelo usuário.
 *
 * @author gda_a
 */
public class Ado_14_Algoritimos2 {

    public static void main(String[] args) {
       
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Coloque Nota 1 ");
        float n1 = numero.nextFloat();
        
        System.out.println("Coloque Nota 2 ");
        float n2 = numero.nextFloat();
        
        System.out.println("Coloque Nota 3 ");
        float n3 = numero.nextFloat();
        
        float media = (n1 + n2 + n3) / 3;
        System.out.println("A média das notas é = " + media);
    }
}


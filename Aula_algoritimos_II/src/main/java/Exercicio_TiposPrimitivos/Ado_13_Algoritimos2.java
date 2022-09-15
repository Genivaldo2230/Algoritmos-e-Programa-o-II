/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

import java.util.Scanner;

/**
 * Desenvolva um algoritmo que receba como entrada do usuário um número inteiro
 * e devolva como saída esse mesmo número multiplicado por 6 e dividido por 8.
 *
 * @author gda_a
 */
public class Ado_13_Algoritimos2 {

    public static void main(String[] args) {
        
  Scanner sc = new Scanner(System.in); 
  int a, b;

  System.out.printf("Informe o primeiro valor: ");
  a = sc.nextInt(); 

  System.out.printf("Informe o segundo valor.: ");
  b = sc.nextInt(); 

  System.out.printf("\nResultados:\n");
  System.out.printf("%d + %d = %3d\n", a, b, (a + b));
  System.out.printf("%d - %d = %3d\n", a, b, (a - b));
  System.out.printf("%d * %d = %3d\n", a, b, (a * b));
  System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
  System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double)a / b));
  }

}
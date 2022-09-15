/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_LacoRepeticao;

/**
 * Desenvolver um algoritmo em Java que exiba os números ímpares de 1 a 100 -
 * Utilize o laço FOR
 *
 * @author gda_a
 */
public class Exercício_01 {

     public static void main(String[] args) {
        int num = 100;

        for (int i = 0; i <= num; i++) {
            
            if (i % 2 != 0) {
                System.out.println("Numero Impares " +i);
            }
        }
    }
}
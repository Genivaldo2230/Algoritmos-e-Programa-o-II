/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_TiposPrimitivos;

/**magine o seguinte problema fictício:
Sabe-se que o professor Fabio (por incrível que pareça) gosta de corridas de rua. 
Costuma(va) correr provas de 5 Km, 10 Km, 16 Km e até 21 Km. 
Sabe-se que o professor costuma (ou costumava) correr a uma média de 10,5 Km/h.
Dada uma distância (como as citada acima), exiba o tempo médio que o professor 
usará para completar a prova.
 *
 * @author gda_a
 */
public class Ado_15_Algoritmos2 {
	public static void main(String[] args){
            
		float kmProva1 = 5;
		float kmProva2 = 10;
		float kmProva3 = 16;
		float kmProva4 = 21;
		float tempoMedio = ((kmProva1/10.5f) + (kmProva2/10.5f) + (kmProva3/10.5f) + (kmProva4/10.5f))/4;
		tempoMedio *= 60;
		System.out.println("O tempo médio gasto em relação as provas foi = " + tempoMedio + ", minutos.");
	}
} 
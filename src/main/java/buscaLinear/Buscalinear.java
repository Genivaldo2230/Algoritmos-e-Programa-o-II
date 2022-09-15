package buscaLinear;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.util.Random;

/**
 *
 * @author genivaldo.aanjos
 */
public class Buscalinear {

    public static void main(String[] args) {
    int[]vetor = criarVetor(10);
    
    int indiceEncontrou = buscarValor(5, vetor);
        System.out.println(indiceEncontrou);
    }        
    private static int[] criarVetor(int tamanho){
        int[]vetorRetorno = new int[tamanho];
        Random rdn = new Random();
        
        for(int i = 0; i< tamanho; i++){
            vetorRetorno[i] = rdn.nextInt(10);
        }
        return vetorRetorno;
    }
    private static int buscarValor(int valor ,int[]vetor){
        int retorno = -1;
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return retorno;
        
    }
}
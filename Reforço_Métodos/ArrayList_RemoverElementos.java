

package Reforço_Métodos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ArrayList_RemoverElementos {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<Integer> numeros = adicionarNumeros(tc);
        removerNumerosPares(numeros);
        imprimirNumeros(numeros);
        
        
        
        
        
        
        
    }

    public static ArrayList<Integer> adicionarNumeros(Scanner tc) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Número "+(i+1)+":");
            numeros.add(tc.nextInt());
            
            
        }
        return numeros;
        
        
    }

    public static void removerNumerosPares(ArrayList<Integer> numeros) {
        
        numeros.removeIf(n -> n% 2 == 0);
        
        
        
    }

    public static void imprimirNumeros(ArrayList<Integer> numeros) {
            
        System.out.println("Números após remover os pares: "+numeros);
        
        
        
        
    }
    
    
    
}

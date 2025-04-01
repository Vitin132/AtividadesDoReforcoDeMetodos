

package Reforço_Métodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade1_ForEachMetodos {
    
    public static int soma(int[]numeros){
        int soma = 0;
        for(int numero : numeros){
            
            
            soma+=numero;
        }
        return soma;
    }
    
    
    public static void main(String[] args) {
        
        
        Scanner tc = new Scanner(System.in);
        
        int[] numeros = {10,20,40,60,80,100};
        
        System.out.println(numeros);
        
        
        int resultado = soma(numeros);
        
        System.out.println("A soma dos números no array é:");
        System.out.println(resultado);
    }
    
    
    
    

}

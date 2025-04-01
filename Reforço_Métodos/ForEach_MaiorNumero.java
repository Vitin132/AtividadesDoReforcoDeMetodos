

package Reforço_Métodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ForEach_MaiorNumero {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        int num = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o "+(i)+" número:");
            num = tc.nextInt();
            
            numeros.add(num);
        }
        
       
        maiorNumero(numeros);
        
        
        
        
    }

    public static void maiorNumero(ArrayList<Integer> numeros) {
                
      
       System.out.println(Collections.max(numeros)); 
        
    }
    
    
    
    
}

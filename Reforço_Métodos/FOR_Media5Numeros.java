

package Reforço_Métodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FOR_Media5Numeros {

    public static void main(String[] args) {
        
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("A média dos números é: "+calcularMedia(tc));
        
        
    }

    public static double calcularMedia(Scanner tc) {
        
        double soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Digite o número "+i+":");
            double numero = tc.nextInt();
            
            soma += numero;
            
        }
        return soma/5;
        
    }
    
    
    
    
    
    
}

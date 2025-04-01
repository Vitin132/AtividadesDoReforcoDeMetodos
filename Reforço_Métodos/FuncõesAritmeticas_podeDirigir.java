

package Reforço_Métodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FuncõesAritmeticas_podeDirigir {
        
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = tc.nextInt();
        
        
        System.out.println("Você possui carteira de motorista? (true/false)");
        boolean temCNH = tc.hasNextBoolean();
        
        System.out.println("A pessoa pode dirigir? "+podeDirigir(idade,temCNH));
        
    }

    public static boolean podeDirigir(int idade, boolean temCNH) {
        
        return idade >= 18 && temCNH;
        
        
    }
    
    
    
    
}

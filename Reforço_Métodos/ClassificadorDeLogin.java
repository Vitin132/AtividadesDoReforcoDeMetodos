

package Reforço_Métodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ClassificadorDeLogin {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Digite seu login: ");
        String login = tc.nextLine();
        
        if(verificadorLogin(login)){
            
            System.out.println("Login válido!");
            
        }else{
            
            System.out.println("Login Inválido!");
            
        }
        
        
        
    }

    public static boolean verificadorLogin(String login) {
        
        return login.length() >= 6 && !login.contains(" ");
        
        
    }
    
    
    
}

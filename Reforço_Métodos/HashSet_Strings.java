

package Reforço_Métodos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class HashSet_Strings {
    
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();
        
        
        adicionarString(palavras);
        
    }

    public static void adicionarString(HashSet<String> palavras) {
        
        
        Collections.addAll(palavras, "difnoifaf", "saioefhawoh", "asoifhiawfiawf");
        System.out.println(palavras);
        
        
        
    }
    
    
    
    
    
    
    
    
}

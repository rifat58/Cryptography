package javaapplication2;

import java.util.*;
public class JavaApplication2 {
    
    static String []alphabets={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    static HashMap<String,Integer>connector=new HashMap<String,Integer>();
    
    
    static void ciphertext(){
        
        for(int i=0;i<alphabets.length;i++){
            connector.put(alphabets[i],i);
        }
        
        System.out.println("Enter the shift key :");
        int shift=new Scanner(System.in).nextInt();
        System.out.println("Enter the text to encrypt :");
        String []input =new Scanner(System.in).nextLine().toLowerCase().split("");
        
        
        for(int j=0;j<input.length;j++){
            
            String chargot=input[j];
            int charposition=connector.get(chargot);
            int finalnum=(charposition+shift)%26;
            System.out.print(alphabets[finalnum]);
            }
        }
   
    public static void main(String[] args) {
           
        ciphertext();
    }
    
}

package SeleniumJavaCode;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInStringThroughSet {
    public static void main(String[] args) {
       String str = "My name is Sonam Mishra";
       
       Set<Character> list = new HashSet<>();
       
       for(int i=0; i<str.length()-1; i++){
           for(int j=i+1; j<str.length()-1; j++){
               if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) && str.charAt(i)!=' '){
                   list.add(str.toLowerCase().charAt(i));
                   
               }
           }
       }
       System.out.println("Dup: " +list);
    }
}
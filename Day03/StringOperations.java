package Day03;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
    
        System.out.println("String Concatenation: "+str+" Yippy!!!!");
        System.out.println("String Lenth: "+ str.length());
        System.out.println("String in Uppercase: "+str.toUpperCase());
        System.out.println("String in Lowercase: "+str.toLowerCase());
        System.out.println("String Indexing: "+str.charAt(0));
        
        System.out.println("Enter string with spaces at the start and end: ");
        String str1=sc.nextLine();
        System.out.println("Trimmed Spaces From String: "+str1.trim());
    }
    
}

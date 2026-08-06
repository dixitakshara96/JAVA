package Self_Learning;
import java.util.Scanner;

public class Loop_Scanner {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of which table you want to print: ");
        int num= sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+"X"+i+"="+num*i);
        }

    }
    
}

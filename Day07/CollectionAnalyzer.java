package Day07;
import java.util.Scanner ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class CollectionAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        HashSet<Integer> unique = new HashSet<>();

        while(true) {
            try {
                System.out.println("Enter element : ");
                int input = sc.nextInt();
                if (input == -1) { 
                    break;
                }
                array.add(input);
                unique.add(input);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        }

        int totalNumber = array.size();
        int sum = 0  ;
        double average;
        int min = array.get(0);
        int max = array.get(0);

        for (int i = 0 ; i < totalNumber ; i++ ) {
            sum += array.get(i) ;

            if ( min > array.get(i)) 
                min = array.get(i);

            if (max < array.get(i))
                max = array.get(i);

            frequency.put(array.get(i) , frequency.getOrDefault(array.get(i), 0) + 1);
        }
        average = (sum)/(totalNumber);

        System.out.println("\n---DETAILS---\n");
        System.out.println("Total Numbers: " + totalNumber);
        System.out.println("Sum : " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Unique Elements: " + unique);
        System.out.println("\nFrequency: ");
        
        for (Integer key : frequency.keySet()) {
            
            System.out.println(key + " --->\t " + frequency.get(key));
            
        }

    }
    
}

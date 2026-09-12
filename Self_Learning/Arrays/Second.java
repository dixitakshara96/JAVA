package Arrays;
import java.util.Arrays;

public class Second {

    public static void main(String[] args) {

        String[] name = new String[4];

        name[0] = "Harry";
        name[1] = "Paaro";
        name[2] = "Devdas";
        name[3] = "Chandramukhi";

        System.out.println(Arrays.toString(name));

        name[0] = "Chunni Babu";

        System.out.println(Arrays.toString(name));

        // dekho pehle name[0] point kar rha tha "Harry" ko phir second mai humne kya kiya ki name[0] ko humne point kra diya "Chunni Babu" ki taraf
        // Array are mutable.
        
    }
    
}

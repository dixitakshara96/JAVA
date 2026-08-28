package Code_Analysis.Task07;

public class Case_2 {

    static int test () {

        try {
            return 0;
        }

        finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[]args) {

        System.out.println(test());

    }
    
}

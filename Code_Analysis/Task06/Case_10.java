package Code_Analysis.Task06;

public class Case_10 {

    public static void main(String[]args) {

        int i = 1;

        while (i <= 5) {

            if (i == 3) {
                //  loop become infinite if we don't write this i++ and even don't print anything
                i++; // this is necessary because it will going to increment the value of i so that 4 and 5 will print after the next iteration`
                continue;
            }

            System.out.println(i + " ");
            i++;
        }
    }
    
}

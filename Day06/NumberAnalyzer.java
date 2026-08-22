import Day07.TextIO;

public class NumberAnalyzer {

    public static void main(String[] args) {

        int divisor = 0;
        int count = 0;
        int sum = 0;
        float average;

        while(true) {

            System.out.println("\nEnter any +ve integer: ");
            int number = TextIO.getInt();

           

            if ( number == 0 && count == 0){
                System.out.println("Entered no. is 0 BYE BYE! ");
                break;
            }
            
            else if (number != 0) {
                if ( number < 0 ) {

                    System.out.println("Entered no. is -ve . Please enter a +ve integer");
                    continue;
                }

                else {
                    System.out.println("Divisor : ");

                    for (int i = 1 ; i <= number ; i++) {
                        
                        if ( number % i == 0) {
                            System.out.print(i + " ");
                            divisor++ ;
                        }

                    }

                    System.out.println("\nTotal Divisor: " + divisor);
                    sum += number;
                    count++ ;
                }
            }

            else if ( number == 0 && count != 0){
                    
                average = ((float)sum / (float)count) ;
                System.out.println("Average: " + average + "\nSum: " + sum + "\nValues Entered: " + count) ;
                break;
            }
        }
    }


}
    


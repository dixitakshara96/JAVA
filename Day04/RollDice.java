package Day04;

public class RollDice{
    public static void main(String[] args){
        int dice1;
        int dice2;
        int total;
        

        dice1 = (int)(Math.random() * 6) + 1;
        dice2 = (int)(Math.random() * 6) + 1;
        total = dice1 + dice2;


        String rollType = (dice1 == dice2) ? "Doubles!" : "RegularRoll";

        System.out.println("---ROLL RESULT---");
        System.out.println("First Dice: " + dice1);
        System.out.println("Second Dice: " + dice2);
        System.out.println("Total: "+total);
        System.out.println("Result: "+rollType);
    }
}
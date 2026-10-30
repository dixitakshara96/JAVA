package Self_Learning.Exceptions;

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }
}

public class CustomException {
    
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        try {
            if (a/b == 0) throw new MyException("Can't get zero try again");
        }
        catch(MyException e) {
            System.out.println(e);
        }

        
    }
}

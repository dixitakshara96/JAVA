package Self_Learning.Exceptions;

class MyThrows {

    void show() throws ClassNotFoundException
    {
        Class.forName("MyThrows");
    }
}

public class Throws2 {
    
    public static void main(String[] args) {

        MyThrows t1 = new MyThrows();
        try {
            t1.show();
        }
        catch(ClassNotFoundException e) {
           
            System.out.println("No worries");
        }
    }
}

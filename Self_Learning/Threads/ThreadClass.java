package Self_Learning.Threads;


class A extends Thread {

    public void run() {
        
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Thread 1");

            try {
                Thread.sleep(5);
            }
            catch(InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

class B extends Thread {

    public void run() {

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Thread 2");
        }

        try {
                Thread.sleep(5);
            }
        catch(InterruptedException e) {
                e.getMessage();
            }
    } 
}


public class ThreadClass {

    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
                Thread.sleep(2);
            }
            catch(InterruptedException e) {
                e.getMessage();
            }
        obj2.start();
    }
}


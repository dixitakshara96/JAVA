package Self_Learning.Threads;

class A implements Runnable {
    public void run() {
        for (int i = 0 ; i < 45; i++) {
            System.out.println("Thread 1");

            try {
                Thread.sleep(2);
            }
            catch(InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0 ; i < 45; i++) {
            System.out.println("Thread 2");

            try {
                Thread.sleep(2);
            }
            catch(InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

public class RunnableInterface {

    public static void main(String[] args) {

        Runnable obj1 = new A(); 
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        try {
                Thread.sleep(2);
            }
            catch(InterruptedException e) {
                e.getMessage();
            }

        t2.start();
    }
}

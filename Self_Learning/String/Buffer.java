package String;

public class Buffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Akshara");
        System.out.println(sb.capacity()); // how much space it can hold
        System.out.println(sb.length()); // how many space is occupied

    
        StringBuffer sb1 = new StringBuffer();
        System.out.println("\n" + sb1.capacity()); // always +16 more space
        System.out.println(sb1.length());

        // converting sb to string type
        String str = sb.toString();

        sb.append(" Dixit");
        sb.ensureCapacity(7);

        System.out.println(sb);
    }
}

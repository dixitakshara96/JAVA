package String;

public class StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Never");
        System.out.println(sb.capacity());
        System.out.println(sb.length);
        sb.append(" Have I ever");

        System.out.println(sb);

    }
    
}

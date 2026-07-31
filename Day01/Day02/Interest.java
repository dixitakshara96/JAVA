package Day02;

public class Interest {
    public static void main(String[] args){
        double principal=17000.0;
        double rate=0.07;
        double time=2;
        double interest = principal*rate*time ;

        System.out.println("Interest: "+ interest );
        System.out.println("Principal : "+ principal);
        System.out.println("Rate of interest : "+(rate*100) );
        System.out.println("Time : "+time);
    }
    
}

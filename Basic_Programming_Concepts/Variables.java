package Basic_Programming_Concepts;

public class Variables {

    static int var1 = 10;

    int var2 = 10;

    public void method1() {

        int var3 = 10;

        System.out.println("Static: " + var1 + "\nInstance: " + var2 + "\nLocal: " + var3);
        System.out.println();
        var1++;
        var2++;
        var3++;
    }

    public static void main(String[] args) {

        Variables obj = new Variables();
        obj.method1();
        obj.method1();
        obj.method1();
        obj.method1();
    }
}

// Notes : for self 

// Static (var1): Class ka variable hai. Ek hi copy hoti hai aur har method call mein increment hone ke baad value preserve hoti hai.
// Instance (var2): Object ka variable hai. Same object obj ke through method call karne par value preserve hoti hai.
// Local (var3): Method ke andar create hota hai. Har method call par dobara 10 se initialize hota hai.

// Main point: Static aur instance variables apni updated values retain karte hain, lekin local variable har method call mein fresh initialize hota hai.

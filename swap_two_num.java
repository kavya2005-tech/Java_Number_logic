import java.util.*;
public class swap_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Swapping using temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
        // Swapping using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
        // Swapping using +,-
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
        // Swapping using *,/
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + ", b = " + b);
        sc.close();
    }
    
}

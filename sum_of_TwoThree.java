import java.util.*;
public class sum_of_TwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while(b!=0){
            int carry = (a&b)<<1;
            a = a^b;
            b = carry;
        }
        System.out.println("Sum of two number is "+a);
        while(c!=0){
            int carry = (a&c)<<1;
            a = a^c;
            c = carry;
        }
        System.out.println("Sum of three number is "+a);
        sc.close();
    }
}

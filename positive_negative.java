import java.util.*;
class positive_negative{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
       int sign = (n>>31)&1;
       String[] ans = {"Positive","Negative"};
       System.out.println(ans[sign]);
    }
}
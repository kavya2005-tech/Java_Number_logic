import java.util.Scanner;
public class even_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if((n&1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        String[] ans = {"Even", "Odd"};
        System.out.println(ans[n&1]);
    }

}
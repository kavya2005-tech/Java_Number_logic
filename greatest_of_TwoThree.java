import java.util.Scanner;
public class greatest_of_TwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ans = {a,b};
        int d1 = a-b;
        int val1 = (d1>>31)&1;
        System.out.println("Greatest between a and b is: " + ans[val1]);
        int d2 = ans[val1] - c;
        int[] result = {ans[val1],c};
        int val2 = (d2>>31)&1;
        System.out.println("Greatest among three is: " + result[val2]);
        sc.close();

    }
}

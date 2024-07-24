import java.util.Scanner;

public class MaxNumber {
    static void findMax(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
            if (a > c) {
                max = c;
            }

        } else {
            max = b;
            if (c > b) {
                max = c;
            }
        }
        System.out.println("Maximum is : "+max);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 1st Number : ");
        a = scn.nextInt();
        System.out.println("Enter 2nd Number : ");
        b = scn.nextInt();
        System.out.println("Enter 3rd Number : ");
        c = scn.nextInt();
        findMax(a, b, c);
    }
}

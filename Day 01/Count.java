import java.util.Scanner;

class Count {

    static void countFunc(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("count is : "+count);
    }

    public static void main(String args[]) {

        System.out.println("Enter the Number  : ");
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        countFunc(n);

    }
}
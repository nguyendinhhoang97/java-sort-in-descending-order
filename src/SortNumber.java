import java.util.Scanner;

public class SortNumber {
    public static void displaySortedNumber(int a, int b, int c) {
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("3 number after sorted: " + c + ">" + b + ">" + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input a=: ");
        a = scanner.nextInt();
        System.out.print("Input b=: ");
        b = scanner.nextInt();
        System.out.print("Input c=: ");
        c = scanner.nextInt();
        displaySortedNumber(a, b, c);
    }
}

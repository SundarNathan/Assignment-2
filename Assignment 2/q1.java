import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a=sc.nextInt();
        System.out.print("Enter first Number: ");
        int b=sc.nextInt();
        System.out.print("Enter second Number: ");
        int c=sc.nextInt();
        System.out.print("\nThe greatest number is "+ Math.max(a,(Math.max(b,c))));

    }
}
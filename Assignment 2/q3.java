import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Table no.: ");
        int a= new Scanner(System.in).nextInt();
        System.out.print("Table upto.: ");
        int b= new Scanner(System.in).nextInt();

        for(int i=0;i<=b;i++)
        {
            System.out.println(a+" x "+i+" = "+a*i);
        }

    }
}
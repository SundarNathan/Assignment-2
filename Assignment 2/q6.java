import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the values of the array (space separated):");
        String[] str= new Scanner(System.in).nextLine().split(" ");

        for(int i=0;i<str.length;i++)
        {
            if(Integer.parseInt(str[i])%2==0)
                System.out.print(str[i]+" ");
            else
                continue;
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers (space separated)");
        String[] str = sc.nextLine().split(" ");

        System.out.print("Number to search: ");
        int a = sc.nextInt();

        int c = 0;

        for (int i = 0; i < str.length; i++)
        {
            if(str[i].equals(String.valueOf(a)))
            {
                c++;
                if(c==2)
                {
                    System.out.println("Second index is "+i);
                    break;
                }
            }
        }
    }
}
import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter student's score (within 0 to 100): ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a>100||a<0)
            System.out.println("Invalid Score.");
        else if(a>90)
            System.out.println("Grade is A");
        else if(a>80)
            System.out.println("Grade is B");
        else if(a>70)
            System.out.println("Grade is C");
        else if(a>60)
            System.out.println("Grade is D");
        else if(a>50)
            System.out.println("Grade is E");
        else
            System.out.println("Fail");
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++)
        {

            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int n)
    {

        if(n==1)
            return false;
        for(int i=2; i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
import java.util.*;


class MagicNo
{
    public static void find(int n)
    {
        int i=0,sum=10;
        while(sum>9)
        {
            sum=0;
            while(n!=0)
            {
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
            n=sum;
        }
        if(sum==1)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        find(n);
    }
}

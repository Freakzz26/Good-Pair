import java.util.Scanner;
class pair_check
{
    void check(int array[],int n,int b)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]+array[j]==b)
                {
                    count++;
                }
            }
        }
        System.out.println("count: "+count);
    }
}
public class good_pair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter value: ");
        int b=scanner.nextInt();
        pair_check pc=new pair_check();
        pc.check(array,n,b);


    }
}

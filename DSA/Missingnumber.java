package DSA;

public class Missingnumber {
    public static void main(String[] args)
    {
       int[] arr={1,2,4,5};
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
            sum+=arr[i];
            if(arr[i]>max)
            {
                max=arr[i];
            }
       }
       int sum2=0;
       for(int i=0;i<=max;i++)
       {
            sum2+=i;
       }
       System.out.println(sum2-sum);                                       
    }
    
}

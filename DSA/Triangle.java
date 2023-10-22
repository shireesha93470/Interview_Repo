package DSA;

public class Triangle {
    public static void main(String[] args)
    {
        int num=5;
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=num-i;k<num;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=num;i>0;i--)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=num-i;k<num;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}

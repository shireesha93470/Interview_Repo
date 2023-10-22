package DSA;
public class Armstrong {
   
        public static void main(String[] args)
        {
            int num=153;
            int sum=0;
            String numstr=""+num;
            int temp=num;
           while(num>0)
           {
               int rem=num%10;
               sum+=Math.pow(rem,numstr.length());
               num/=10;
               
           }
           if(sum==temp)
           {
               System.out.println("arm");
           }else
           {
               System.out.println("not");
           }
        }
    }


package DSA;
public class alphanumeric {
    public static void main(String[] args)
    {
        String str="sirireddy";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String spl="@!#$%^&*";
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<alpha.length();j++)
            {
                if(str.charAt(i)==alpha.charAt(j))
                {
                    count++;
                }
            }
        }
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<num.length();j++)
            {
                if(str.charAt(i)==num.charAt(j))
                {
                    count1++;
                }
            }
        }
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<spl.length();j++)
            {
                if(str.charAt(i)==spl.charAt(j))
                {
                    count2++;
                }
            }
        }
        if(count > 0 && count1 >0 && count2 > 0)
        {
            System.out.println("Alpha");
        }else{
            System.out.println("not");
        }
    }
    
}

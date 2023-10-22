package DSA;
public class ReverseString {
    public static void main(String[] args)
    {
    String str="siri";
    String bag="";
    for(int i=str.length()-1;i>=0;i--)
    {
        bag+=str.charAt(i);
    }
    
    System.out.println(bag);
  }
}

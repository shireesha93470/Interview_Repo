package DSA;
public class occurence {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,1,2,1,2,3};
    int occurence=1;
    int count = 0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==occurence)
        {
            count++;
        }
    }
    System.out.println(occurence+count);
    
  }
}

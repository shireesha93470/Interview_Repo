package DSA;

public class MissingNumbers {
    public static void main(String[] args)
    {
        int[] arr = {0,2,3,4,6,7,8,10,13,15,16,17,5,12,20};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        int[] result = new int[100];
        for(int i = 0 ; i < arr.length ; i++)
        {
            result[arr[i]] += 1;
        }
        for(int i = min ; i <=max ; i++)
        {
            result[i] += 1;
        }
        for(int i = 0 ; i < result.length ; i++)
        {
            if(result[i] == 1)
            {
                System.out.println(i+" ");
            }
        }
    
    }
    
}

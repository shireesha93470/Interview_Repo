package DSA;
public class Duplicates {
    public static void main(String[] args)
    {
    
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
            // System.out.println("Duplicate found: " + arr[i]);
            
        }
        
    }
    
}
System.out.println(count);

    }
    
    
}

package DSA;
public class Reversearray {
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int length = arr.length;
    
            // Reverse and print the array using a while loop
            System.out.println("Reversed Array:");
            int index = length - 1;
    
            while (index >= 0) {
                System.out.print(arr[index] + " ");
                index--;
            }
        }
    }
    


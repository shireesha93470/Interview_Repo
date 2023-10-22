public class Sumoftwosmallnum {
  public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 2, 1};
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] < secmin) {
                secmin = arr[i];
            }
        }

        if (secmin != Integer.MAX_VALUE) {
            int sum = min + secmin;
            System.out.println("Sum of the two smallest numbers: " + sum);
        } else {
            System.out.println("Array doesn't have enough elements.");
        }
    }
}

    


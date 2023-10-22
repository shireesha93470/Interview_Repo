package DSA;
public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " "); 
        for (int i = 2; i < num; i++) { 
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

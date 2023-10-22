public class Armstrongnum {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        String numstring = Integer.toString(num);

        for (int i = 0; i < numstring.length(); i++) {
            int rem = numstring.charAt(i) - '0';
            sum += Math.pow(rem, numstring.length());
        }

        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
    
}

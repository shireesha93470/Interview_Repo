public class Substring {
    public static void main(String[] args) {
        String str = "bootcamp";
        int end = str.length();
        int count = 0;
        
        for (int i = 0; i < end; i++) 
        {

            for (int j = i; j < end; j++) 
            {
                count++;
               
            }
        }
        System.out.println("Total substrings: " + count);
    
}
}

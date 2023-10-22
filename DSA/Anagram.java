package DSA;
public class Anagram {
   
        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";
    
            if (str1.length() != str2.length()) {
                System.out.println("The strings are not anagrams");
                return;
            }
    
            // Create an array to count occurrences of each character in str1
            int[] charCount = new int[256];
    
            // Increase counts for characters in str1
            for (int i = 0; i < str1.length(); i++) {
                charCount[str1.charAt(i)]++;
            }
    
            // Decrease counts for characters in str2
            for (int i = 0; i < str2.length(); i++) {
                charCount[str2.charAt(i)]--;
            }
    
            // Check if all counts in charCount are 0
            boolean isAnagram = true;
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
    
            if (isAnagram) {
                System.out.println("The strings are anagrams");
            } else {
                System.out.println("The strings are not anagrams");
            }
        }
    }
    

// public class Anagram
// {
// 	public static void main(String[] args)
// 	{
// 		char[] str1= "angel".toCharArray();
// 		char[] str2= "gneal".toCharArray();
		
// 	       //and take one gobal flag
// 		String flag="anagram";
		
// 		//we run the first string loop
// 		for(int i = 0; i < str1.length; i++)	
// 		{
// 			//we run thesecond string loop
// 			for(int j = 0; j < str2.length; j++)	
// 			{
// 				//we check the condintion will be true in that palce store #
// 				if(str1[i] == str2[j])	
// 				{
// 					str1[i] = '@';
// 					str2[j] = '@';
// 				}
// 			}
// 		}
// 		// checking anagram or not;
// 		for(int i = 0; i < str1.length; i++) 
// 		{
// 			//the str1 is not! to #
// 			if(str1[i] != '@')	
// 			{
// 			   flag = "Not a anagram";
// 			   break;
// 			}
// 		}
// 		System.out.println(flag);
		
// 	}

// }	
	
	
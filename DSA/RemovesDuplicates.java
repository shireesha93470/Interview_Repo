package DSA;

public class RemovesDuplicates {
    public static void main(String[] args){
        String str="siri";
        for(int i = 0 ; i < str.length() ; i++){
            int count = 0;
            for(int j = 0 ; j < i ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(str.charAt(i)+ " ");
            }
        }
    }
}

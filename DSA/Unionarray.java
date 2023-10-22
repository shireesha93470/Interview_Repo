package DSA;
public class Unionarray {
   
        public static void main(String[] args) {
            int[] arr1 = {1,2,3,4,5,6};
            int[] arr2 = {3,4,8,9};
            int[] result = new int[100];
            for(int i=0;i<arr1.length;i++)
            {
                result[arr1[i]]+=1;;
            }
            for(int j=0;j<arr2.length;j++)
            {
                result[arr2[j]]+=1;
            }
            for(int i=0;i<result.length;i++)
            {
                if(result[i]>0)
                {
                    System.out.println(i+"");
                }
            }
            
            
        }
    }


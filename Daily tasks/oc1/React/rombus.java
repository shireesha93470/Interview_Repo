// class HelloWorld {
//     public static void main(String[] args) {
//       int num=5;
//       for(int i=0;i<num;i++){
//            for(int j=0;j<num-i;j++){
//                System.out.print(" ");
               
//            }
//           for(int k=num-i;k<num;k++){
//               System.out.print(i+" "); 
//            }
// System.out.println();
           
//       }
//         for(int i=num;i>0;i--){
//            for(int j=0;j<num-i;j++){
//               System.out.print(" ");
               
//           }
//           for(int k=num-i;k<num;k++){
//               System.out.print(i+" "); 
//            }
//            System.out.println();
           
//       }
//     }
// }

class HelloWorld {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                if (k == 0 || k == i * 2 || i == num - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = num - 2; i >= 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                if (k == 0 || k == i * 2 || i == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

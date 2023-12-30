import java.util.Arrays;
import java.util.Scanner;

class rishav {

    public static void main(String[] args) {
      int arr[][]={{11,23,44},{213,324,422},{234,234,24}};
      int min =arr[0][0];
      int maxCol =0;

      for (int i=0; i<3;i++){
          for (int j=0; j<3;j++){
              if (arr[i][j]<min){
                  min=arr[i][j];
                  maxCol =j;
              }
          }
      }
        System.out.println(min);

        int max =arr[0][0];
        int k=0;
        while (k<3){
            if (arr[k][maxCol]>max){
                max=arr[k][maxCol];
            }
            k++;
        }
        System.out.println(max);

    }

    static class abc{
        public static void main(String[] args) {
            int arr[][]={{11,23,44},{213,324,422},{234,294,24}};
            int firstMax = Integer.MIN_VALUE; // Initialize with the smallest possible value
            int secondMax = Integer.MIN_VALUE; // Initialize with the smallest possible value

            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    if (arr[i][j] > firstMax){
                        secondMax = firstMax;
                        firstMax = arr[i][j];
                    } else if (arr[i][j] > secondMax && arr[i][j] != firstMax){
                        secondMax = arr[i][j];
                    }
                }
            }

            System.out.println("Second largest number is: " + secondMax);
        }
    }

}

 class swap{
    public static void main(String[] args) {
        int a[] = {2, 6, 1, 4, 9};
        int temp;

// 1,2,3,4,6, 9

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }




/* int a= 5;
int b =4;
/*int temp;
temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
// Swap with out variable

a=a+b;  // a= 9
b=a-b;  //b = 5
a=a-b; // a= 4  */


    }
     public static class anagram{

         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             String str1 = sc.nextLine();
             String str2 =sc.nextLine();

             char[] chars1 = str1.toCharArray();
             char[] chars2 = str2.toCharArray();

             Arrays.sort(chars1);
             Arrays.sort(chars2);

            boolean result= Arrays.equals(chars1,chars2);

             System.out.println(result);
         }
     }



     static  class   stimng {
         public static void main(String[] args) {
             String Ris = "Anchal";
             String t = "";

             for (int i = Ris.length() - 1; i >= 0; i--) {
               t=t+Ris.charAt(i);
             }
             System.out.println(t);
         }
     }}
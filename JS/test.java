package JS;

import java.util.Scanner;

public class test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.print("������ �Է� : ");
      int num = scan.nextInt();
      int len = 0;
      
      for(int i =1; i<num; i*=10) {
         len = i;
      }
      for(int i=0; len>=1; i++) {
         System.out.println(len+"�� �ڸ� : "+num/len);
         num = num % len;
         len/=10;
      }
   }   

}
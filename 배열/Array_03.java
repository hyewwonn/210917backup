package �迭;

public class Array_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[] {10,12,13,14,15,20,34,32,30,40};
		
		for(int i = 0; i<10; i++) {
			System.out.println(score[i]);
		}
		
		for(int i=0; i<10; i++) {
	         System.out.println(score[i]); //i => �ε���(0~9)
	      } //for
	      
	      //��(������ sum+=i), ���
	      int sum = 0;
	      for(int i=0; i<10; i++) {
	         sum+=score[i];
	      }
	      System.out.println("���� �հ� : " + sum);
	      
	      //���
	      double average;
	      average = sum/10.0; //�ڿ� �Ҽ��� �ٿ� ��� ��
	      System.out.println("��� : " + average);
	}
}

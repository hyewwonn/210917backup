package �ݺ���;

public class For1to10sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0; 
		for (int i=1; i<=10; i++) {
			sum1 += i;
		}
		System.out.println("1~10�� �� : "+sum1);
		
		int sum2 = 0;
		for (int i=1; i<=100; i++) {
			sum2 += i;
		}
		System.out.println("1~100�� �� : "+sum2);
	}
}

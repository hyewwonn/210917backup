package �迭;

public class ForEx_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int sum = 0;
		//�ʱ�ȭ
		for(int i = 0; i<a.length; i++) {
			a[i] = (i+1);
			sum += a[i];
		}
			System.out.println(sum);
		
	}
}

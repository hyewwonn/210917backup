package �迭;

public class Array_sum {
	/*1-2+3-4...+99-100 �� �հ踦 1���� �迭�� �̿��� ���ϱ�
	 * (�ʱ�ȭ) for���� �̿��Ͽ� �迭�� ���� �����϶�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			a[i] = (i+1);
			if(a[i] % 2 == 0) {
				a[i]*=(-1);
			}
			sum += a[i];
		}
		System.out.println(sum);
	}

}

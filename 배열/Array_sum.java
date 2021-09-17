package 배열;

public class Array_sum {
	/*1-2+3-4...+99-100 의 합계를 1차원 배열을 이용해 구하기
	 * (초기화) for문을 이용하여 배열의 값을 배정하라.
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

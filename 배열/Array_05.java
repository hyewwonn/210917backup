package �迭;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ���� => 10��¥��,  1,2,3,4,5,6,7,8,9,10
		int[] a = new int[10];
		//�ʱ�ȭ
		for(int i = 0; i<a.length; i++) {
			a[i] = (i+1)*2;
		}
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}

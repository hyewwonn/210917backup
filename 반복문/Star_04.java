package �ݺ���;

public class Star_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = (9-(2*i-1))/2; j >= 0; j--) { 
				System.out.print("  ");
			}//���� 9-�� = ����
			for (int s = 1; s <= 2*i-1; s++) {
				System.out.print("* ");
			}//��    9-���� = ��
			System.out.println();
		}
	}

}

package �ݺ���;

import java.util.Scanner;

public class PassCount {
	/*�ذ���
	 * 1. ����� ���, ���� ����
	 * 2. 80�� ������ ī��Ʈ
	 * 3. ���� �Է� �� ����
	 * 4. ����� ��� �� ���
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count = 0;
			int score;
			Scanner scan = new Scanner(System.in);
			
			while (true ) {
				System.out.print("���� �Է� : ");
				score = scan.nextInt();
				if (score>=80) {
					count++;
				}
				if (score < 0) {
					break;
				}
			}
			System.out.println("����ڴ� "+count+"���Դϴ�.");
	}

}

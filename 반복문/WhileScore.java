package �ݺ���;

import java.util.Scanner;
/*0�� �Էµ� ������ score�� �Է� �޾� �Է��� �Ϸ�¸�
������ �հ� ����� ����ϴ� ���α׷��� �ۼ��϶�.

�ذ���
1. ����, ��, ������ ������ �Է��ϴ� ����
2. �����Է�, ������, 0�̸� ���߱�
3. ��, ���(sum/i) ���
*/
public class WhileScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;	
		int score;
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է� : ");
			score = scan.nextInt();
			if(score == 0) break;
			i++;
			sum += score;
			
		}
		System.out.println("�� : "+sum);
		System.out.println("��� : "+sum/i);
	}

}

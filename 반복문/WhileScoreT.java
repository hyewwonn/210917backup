package �ݺ���;

import java.util.Scanner;
/*0�� �Էµ� ������ score�� �Է� �޾� �Է��� �Ϸ�¸�
������ �հ� ����� ����ϴ� ���α׷��� �ۼ��϶�.

�ذ���
1. ����, ��, ������ ������ �Է��ϴ� ����
2. �����Է�, ������, 0�̸� ���߱�
3. ��, ���(sum/count) ���
*/
public class WhileScoreT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	
		int score;
		int sum = 0;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� �Է� : ");
			score = scan.nextInt();
			if(score == 0) break;
			count++;
			sum += score;
			
		}
		avg = sum/count;
		
		System.out.println("�� : "+sum);
		System.out.println("��� : "+avg);
	}

}

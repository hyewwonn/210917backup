package �ݺ���;

import java.util.Scanner;

public class Condition3 {
	/*ť�� ������ ��Ű������*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		int idol = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("ť�� ���̵��� �����ϼ���(�� 1, �ƴϿ� 2) : ");
		answer = scan.nextInt();
		if(answer == 1) {
			System.out.print("�����ΰ���? : ");
			answer = scan.nextInt();
			if(answer ==1) {//����
				System.out.print("����� 6�� �̻��ΰ���? : ");
				answer = scan.nextInt();
				if(answer == 1) {//�� ��
					System.out.print("��� �� ���л��� �ֳ���? : ");
					answer = scan.nextInt();
					if(answer == 1) {//��
						idol = 5;
						getCubeIdol(idol);
					}
					else {//��
						idol = 2;
						getCubeIdol(idol);
					}
				}
				else {//��
					idol = 4;
					getCubeIdol(idol);
				}
			}
			else {//����
				System.out.print("�׷����� �ҼӵǾ� �ֳ���? : ");
				answer = scan.nextInt();
				if(answer == 1) {//�� ��
					System.out.print("���߰��� ����ΰ���? : ");
					answer = scan.nextInt();
					if(answer == 1) {//��
						idol = 1;
						getCubeIdol(idol);
					}
					else {//��
						idol = 3;
						getCubeIdol(idol);
					}
				}
				else {//�� ��
					System.out.print("���εེ�� ���Գ���? : ");
					answer = scan.nextInt();
					if(answer == 1) {//��
							
						idol = 6;
						getCubeIdol(idol);
					}
					else {//��
						idol = 0;
						getCubeIdol(idol);
					}
				}
					
			}
		}	
		else {//���۾���
			System.out.println("�����մϴ�");
		}
			
	}

	public static void getCubeIdol(int idol) {
		System.out.print("������ ť�� ���̵��� ");
		switch(idol) {
		case 0: System.out.println("����"); break;
		case 1: System.out.println("������"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("��Ÿ��"); break;
		case 4: System.out.println("(����)���̵�"); break;
		case 5: System.out.println("���ս�"); break;
		case 6: System.out.println("����ȣ"); break;
		}
	}

}

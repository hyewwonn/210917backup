package �ݺ���;

import java.util.Scanner;

public class Repetition3 {
	/*����ī�� �ܾװ� ������ �Է¹޾� �󸶳� Ż �� �ִ��� ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card;
		int sale;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("����ī�� �ܾ� �Է� : ");
		card = scan.nextInt();
		System.out.print("�Ϲ�:1, û�ҳ�:2, ���:3 �Է� : ");
		sale = scan.nextInt();
		
		if(sale == 1) {
			while(card >= 1199) {
				card -= 1200;
				count ++;
			}//while
		}//if
		else if(sale == 2) {
			while(card >= 1199) {
				card -= 720;
				count ++;
			}//while
		}//else if
		else {
			while(card >= 1199) {
				card -= 450;
				count ++;
			}//while
		}//else
		
		System.out.println("������ "+count+"�� ������ �� �ֽ��ϴ�.");
	}

}

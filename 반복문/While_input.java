package �ݺ���;

import java.util.Scanner;

/* ����(�Է��� 1)�� �Էµ� ������ �Է��� �޴� ���α׷� �ۼ�*/
public class While_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;	
		int input;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("���� �Է� : ");
			input = scan.nextInt();
			if(input == 1) break;
		}
	}

}

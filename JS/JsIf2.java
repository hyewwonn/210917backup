package JS;

import java.util.Scanner;

public class JsIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shake;
		Scanner scan = new Scanner(System.in);
		System.out.print("�������ũ ���� : ");
		shake = scan.nextInt();
		System.out.println("---����ũ ������ ��� ���---");
		
		for(int i = 1; i<=shake; i++) {
			if(shake % 1 ==0) {
				System.out.println("���� "+i+"��, ���� "+i*2+"��");
			}
			else {
				continue;
			}
		}
	}

}

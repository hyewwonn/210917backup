package JS;

import java.util.Scanner;

public class JsIf1 {

	public static void main(String args[]){
		int gender;
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڹ� ���� �Է� : ");
		score = scan.nextInt( );
	   
		if (score>=94){ 
			System.out.println("A" + "\n");
		}
		else if(score>=84){ 
			System.out.println("B" + "\n");
		}
		else{ 
			System.out.println("C" + "\n");
		}
		
		System.out.print("���� �Է�(�����̶�� 1, �����̶�� 2) : ");
		gender = scan.nextInt( );
		
		if (gender == 1 && score >= 94) { 
			System.out.println("�츮�б� ����л�");
		}
		else if(gender==2) { 
			System.out.println("�츮 �б� �л��� �ƴϳ׿�");
		}
	}
}

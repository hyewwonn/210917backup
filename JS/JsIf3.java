package JS;

import java.util.Scanner;

public class JsIf3 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      int num;
	      int score;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("å�� �帣 ��ǥ���� �˾ƺ��ÿ� : " + "\n" + "1. �θǽ�   2. ������   3. ����   4. �ڱ���");
	      num = scan.nextInt();
	      
	      switch(num) {
	      case 1 : System.out.print("�θǽ� å�� ��ǥ���� ������ ���� �����Դϴ�. ���İ� ������ �Է��ϼ��� : ");
	         score = scan.nextInt();
	         if (score >= 90) System.out.println("A���");
	         else if (score >= 80) System.out.println("B���");
	         else if (score >= 70) System.out.println("C���");
	         else System.out.println("���� �� ����ϼ���."); break;
	      
	      case 2 : System.out.print("������ å�� ��ǥ���� ��Ÿ�� �ҳ���Դϴ�. ���İ� ������ �Է��ϼ��� : ");
	      score = scan.nextInt();
	      if (score >= 90) System.out.println("A���");
	      else if (score >= 80) System.out.println("B���");
	      else if (score >= 70) System.out.println("C���");
	      else System.out.println("���� �� ����ϼ���."); break;

	      case 4 : System.out.print("�ڱ��� å�� ��ǥ���� �Ϸ� 1%�Դϴ�. ���İ� ������ �Է��ϼ��� : ");
	      score = scan.nextInt();
	      if (score >= 90) System.out.println("A���");
	      else if (score >= 80) System.out.println("B���");
	      else if (score >= 70) System.out.println("C���");
	      else System.out.println("���� �� ����ϼ���."); break;
	      
	      default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���İ� ������ �Է��ϼ���.");
	      score = scan.nextInt();
	      }
	      
	   }

	}
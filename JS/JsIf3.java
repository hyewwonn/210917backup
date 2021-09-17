package JS;

import java.util.Scanner;

public class JsIf3 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      int num;
	      int score;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("책의 장르 대표작을 알아보시오 : " + "\n" + "1. 로맨스   2. 스릴러   3. 감성   4. 자기계발");
	      num = scan.nextInt();
	      
	      switch(num) {
	      case 1 : System.out.print("로맨스 책의 대표작은 달콤한 나의 도시입니다. 독후감 점수를 입력하세요 : ");
	         score = scan.nextInt();
	         if (score >= 90) System.out.println("A등급");
	         else if (score >= 80) System.out.println("B등급");
	         else if (score >= 70) System.out.println("C등급");
	         else System.out.println("조금 더 노력하세요."); break;
	      
	      case 2 : System.out.print("스릴러 책의 대표작은 불타는 소녀들입니다. 독후감 점수를 입력하세요 : ");
	      score = scan.nextInt();
	      if (score >= 90) System.out.println("A등급");
	      else if (score >= 80) System.out.println("B등급");
	      else if (score >= 70) System.out.println("C등급");
	      else System.out.println("조금 더 노력하세요."); break;

	      case 4 : System.out.print("자기계발 책의 대표작은 하루 1%입니다. 독후감 점수를 입력하세요 : ");
	      score = scan.nextInt();
	      if (score >= 90) System.out.println("A등급");
	      else if (score >= 80) System.out.println("B등급");
	      else if (score >= 70) System.out.println("C등급");
	      else System.out.println("조금 더 노력하세요."); break;
	      
	      default : System.out.println("잘못 입력하셨습니다. 독후감 점수를 입력하세요.");
	      score = scan.nextInt();
	      }
	      
	   }

	}
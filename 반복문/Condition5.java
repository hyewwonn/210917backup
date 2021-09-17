package 반복문;

import java.util.Scanner;

public class Condition5 {
	/*입력받은 수가 소수인지 아닌지 출력*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2이상의 숫자 입력 : ");
		n = scan.nextInt();
		
		switch(n) {
		case 2: System.out.println(n+"은/는 소수입니다."); break;
		default:
			for(int i = 2; i<=n-1; i++) {
				if(n%i==0) {
					count ++;
					break;
				}
				else {
					continue;
				}
			}
			if(count == 0) {
				System.out.println(n+"은/는 소수입니다."); break;
			}
			else {
				System.out.println(n+"은/는 소수가 아닙니다.");
			}
		}
		
	}

}
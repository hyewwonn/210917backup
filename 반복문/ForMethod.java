package 반복문;
import java.util.Scanner;	
public class ForMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.키보드로부터 숫자 n 입력
		//2.1~n까지의 합을 구하라
		//3.단, 메서드를 이용해 구하라.(getSum())
		int n;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n = scan.nextInt();
		
		int result = getSum(n);
		System.out.println(result);
	}
	public static int getSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		
		}
		return(sum);
	}

}

package �ݺ���;
import java.util.Scanner;	
public class ForMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Ű����κ��� ���� n �Է�
		//2.1~n������ ���� ���϶�
		//3.��, �޼��带 �̿��� ���϶�.(getSum())
		int n;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
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

package JS;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int money;
		int a=50000, b=10000, c=5000, d=1000, e=500, f=100, g=50, h=10;
		System.out.print("�� �Է� : ");
		money = scan.nextInt();
		
		System.out.println(a+"�� : "+money/a+"��");
		money%=a;
		
		System.out.println(b+"�� : "+money/b+"��");
		money%=b;
		
		System.out.println(c+"�� : "+money/c+"��");
		money%=c;
		
		System.out.println(d+"�� : "+money/d+"��");
		money%=d;
		
		System.out.println(e+"�� : "+money/e+"��");
		money%=e;
		
		System.out.println(f+"�� : "+money/f+"��");
		money%=f;
		
		System.out.println(g+"�� : "+money/g+"��");
		money%=g;
		
		System.out.println(h+"�� : "+money/h+"��");
		money%=h;
	}

}

package JS;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int money;
		int a=50000, b=10000, c=5000, d=1000, e=500, f=100, g=50, h=10;
		System.out.print("돈 입력 : ");
		money = scan.nextInt();
		
		System.out.println(a+"원 : "+money/a+"개");
		money%=a;
		
		System.out.println(b+"원 : "+money/b+"개");
		money%=b;
		
		System.out.println(c+"원 : "+money/c+"개");
		money%=c;
		
		System.out.println(d+"원 : "+money/d+"개");
		money%=d;
		
		System.out.println(e+"원 : "+money/e+"개");
		money%=e;
		
		System.out.println(f+"원 : "+money/f+"개");
		money%=f;
		
		System.out.println(g+"원 : "+money/g+"개");
		money%=g;
		
		System.out.println(h+"원 : "+money/h+"개");
		money%=h;
	}

}

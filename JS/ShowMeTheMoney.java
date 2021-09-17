package JS;

import java.util.Scanner;

public class ShowMeTheMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int money;
		System.out.print("µ· ÀÔ·Â : ");
		money = scan.nextInt();
		int[] don = new int[] {50000,10000,5000,1000,500,100,50,10};
		int[] amount = new int[8];
		
		for(int i = 0; i<don.length; i++) {
			if(money>=don[i]) {
				amount[i] = money/don[i];
				money %= don[i];
				
			}
			System.out.println(don[i]+"¿ø : "+amount[i]);
		}
		
	}

}

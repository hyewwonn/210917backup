package JS;

import java.util.Scanner;

public class JsIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shake;
		Scanner scan = new Scanner(System.in);
		System.out.print("딸기셰이크 수량 : ");
		shake = scan.nextInt();
		System.out.println("---셰이크 수량별 재료 목록---");
		
		for(int i = 1; i<=shake; i++) {
			if(shake % 1 ==0) {
				System.out.println("딸기 "+i+"개, 우유 "+i*2+"팩");
			}
			else {
				continue;
			}
		}
	}

}

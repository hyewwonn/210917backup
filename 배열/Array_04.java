package 배열;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//물건값(5개) price
		int sum = 0;
		int[] price = new int[] {1200, 4000, 550, 3500, 1800, 600, 800};
		
		//배열명.length => 모든 배열이 갖고있는 길이 속성
		for(int i = 0; i<price.length; i++) {
			System.out.println(price[i]);
			sum += price[i];
		}
		System.out.println("평균 물건값 : "+sum/price.length);
	}

}

package 배열;

public class Array_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[] {10,12,13,14,15,20,34,32,30,40};
		
		for(int i = 0; i<10; i++) {
			System.out.println(score[i]);
		}
		
		for(int i=0; i<10; i++) {
	         System.out.println(score[i]); //i => 인덱스(0~9)
	      } //for
	      
	      //합(누적합 sum+=i), 평균
	      int sum = 0;
	      for(int i=0; i<10; i++) {
	         sum+=score[i];
	      }
	      System.out.println("점수 합계 : " + sum);
	      
	      //평균
	      double average;
	      average = sum/10.0; //뒤에 소수점 붙여 줘야 함
	      System.out.println("평균 : " + average);
	}
}

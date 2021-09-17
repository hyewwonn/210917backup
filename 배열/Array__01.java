package 배열;

public class Array__01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 선언 연습 데이터타입[ ] 배열명
		int[] hakbun;
		double[] jumsu;
						
		//메모리 할당(new)
		hakbun = new int[14];
		jumsu = new double[14];
						
		//사용자 초기화
		hakbun[0] = 1301;
		jumsu[0] = 100;
						
		System.out.println(hakbun[0]);
		System.out.println(jumsu[0]);
						
		//c언어 초기화X => 쓰레기
		//java 초기화X => 0(JVM)
		System.out.println(hakbun[0]);
		System.out.println(jumsu[10]);
	}

}
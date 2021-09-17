package 배열;

public class Array__02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언, 할당, 초기화
		int [] hakbun = new int[] {1301,1302, 1303, 1304, 1305};
		double[] jumsu = new double[5];
		jumsu[0] = 100;
		jumsu[1] = 95.8;
		jumsu[2] = 89;
		jumsu[3] = 100;
		jumsu[4] = 77.4;
		
		System.out.println(jumsu[0]);
		System.out.println(jumsu[1]);
		System.out.println(jumsu[2]);
		System.out.println(jumsu[3]);
		System.out.println(jumsu[4]);
				
		for(int i = 0; i<5; i++) {
			System.out.println(jumsu[i]);
		}
	}

}

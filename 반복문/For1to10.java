package �ݺ���;
//for�� �̿��Ͽ� 1~10���� ���
public class For1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� 10�� �ݺ�
		//i => �ݺ�Ƚ��
		for (int i=1; i<=10; i++) {//i=1, i<=10?t, p, i=2. i<=10, p, i=3, i<=10?t, i=4
									//i=<=9?t, p, i=10, i<=10?t, p, i=11, i<=10?f
			System.out.print(i+"\t");
		}
		for (int i=0; i<=9; i++) { //0,1,2,3,4,5,6,7,8,9
			System.out.print((i+1)+"\t");
		}
		for (int i=10; i<=20; i++) {
			System.out.print("���̸�");
		}
	}//end of main method

}

package �迭;

public class Array__01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ���� ���� ������Ÿ��[ ] �迭��
		int[] hakbun;
		double[] jumsu;
						
		//�޸� �Ҵ�(new)
		hakbun = new int[14];
		jumsu = new double[14];
						
		//����� �ʱ�ȭ
		hakbun[0] = 1301;
		jumsu[0] = 100;
						
		System.out.println(hakbun[0]);
		System.out.println(jumsu[0]);
						
		//c��� �ʱ�ȭX => ������
		//java �ʱ�ȭX => 0(JVM)
		System.out.println(hakbun[0]);
		System.out.println(jumsu[10]);
	}

}
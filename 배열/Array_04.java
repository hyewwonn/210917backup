package �迭;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ǰ�(5��) price
		int sum = 0;
		int[] price = new int[] {1200, 4000, 550, 3500, 1800, 600, 800};
		
		//�迭��.length => ��� �迭�� �����ִ� ���� �Ӽ�
		for(int i = 0; i<price.length; i++) {
			System.out.println(price[i]);
			sum += price[i];
		}
		System.out.println("��� ���ǰ� : "+sum/price.length);
	}

}

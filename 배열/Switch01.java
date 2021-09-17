package ¹è¿­;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10, 5};
		int temp;
		
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
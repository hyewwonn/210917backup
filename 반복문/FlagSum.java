package ¹Ýº¹¹®;

public class FlagSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) {
				sum += (-i); //sum -= i
			}//if
			else {
				sum += i;
			}
			
		}//for
		System.out.println(sum);
	}

}

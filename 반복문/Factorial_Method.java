package ¹Ýº¹¹®;

public class Factorial_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		getFactorial(n);
	}
	public static void getFactorial(int n) {
		int res = 1;
		for(int i = 1; i<=n; i++) {
			res*=i;
		}
		System.out.println(res);
	}
	
}
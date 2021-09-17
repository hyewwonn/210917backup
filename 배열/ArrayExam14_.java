package ¹è¿­;

public class ArrayExam14_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a = new char[5][5];
		char b = 67;
		char c;
		
		for(int i = 0; i<a.length; i++) {
			c = b++;
			for(int j = 0; j<a.length-i; j++) {
				a[i][j] = c++;
				System.out.print(a[i][j]+"\t");
			} 
			System.out.println();
		}
	}

}

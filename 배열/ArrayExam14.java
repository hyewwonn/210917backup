package ¹è¿­;

public class ArrayExam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][] = new char[5][5];
		char b;
		char k = 'C';
		
		for(int i = 0; i<a.length; i++) {
			b = k++;
			for(int j = 0; j<a.length-i; j++) {
				a[i][j] = b++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
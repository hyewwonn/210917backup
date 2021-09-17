package 배열;
/* 2행 3열  */
public class Array2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][3];
		int[][] b = new int[3][4];//1
		double[][] c = new double[][] {{7.5, 5.7}, {6.3, 3.6}, {5.1, 5.9}, {7.8, 7.1}};
		
		for(int i = 0; i<a.length; i++) { //행의 길이
			for(int j = 0; j<a[i].length; j++) { //열의 길이
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(); //줄바꿈
		}
		
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				b[i][j] = 1;
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i<c.length; i++) {
			for(int j = 0; j<c[i].length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

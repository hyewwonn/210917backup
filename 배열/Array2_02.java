package ¹è¿­;
/*  1 2 3
 *  4 5 6
 *  7 8 9
 */
public class Array2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int k = 0;
		/*a[0][0] = 1;
		 * a[0][1] = 2;
		 */
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				a[i][j] = ++k;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

package �迭;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {5,7,1,9,3};
		int temp;
		
		for(int i = 0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}

}

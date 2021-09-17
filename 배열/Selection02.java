package ¹è¿­;

public class Selection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[] {62,62,62,62,62,62,62,62,62,62,90,90,90,90,90,90,63,63,63,98};
		int temp = 0;
		
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
	}

}

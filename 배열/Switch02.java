package ¹è¿­;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[] {55,76,81};
		int temp;
		
		for(int i = 0; i<score.length; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i]<score[j]) {
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
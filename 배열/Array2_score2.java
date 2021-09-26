package 배열;

import java.util.Scanner;

public class Array2_score2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int sum[] = new int [score.length];
		int max[] = new int [2];
	    //선언
		
	    int rtinput[][] = inputScore(score, scan); //입력
		int rtsum[] = getSumScore(score); //합계
		int rtrank[] = getRank(max, rtsum); //등수
		printResult(score, rtsum, rtrank); //출력

	}
	public static int[][] inputScore(int score[][], Scanner scan) {
		for(int i = 0; i<score.length; i++) {//행      
			for(int j = 0; j<score[i].length; j++) {//열
	        	 System.out.print(i+1+"조 ");
	            switch(j+1) {
	            case 1: System.out.print("완성도 입력 : "); break;
	            case 2: System.out.print("창의성 입력 : "); break;
	            case 3: System.out.print("이해도 입력 : "); break;
	            }
	            score[i][j] = scan.nextInt();
	            while(score[i][j]<0 || score[i][j]>=20) {
	            	System.out.print("재입력 : ");
	            	score[i][j] = scan.nextInt(); //유효성
	            }
	         }
		}
		return(score);
	}//입력
	
	public static int[] getSumScore(int score[][]) {
		int sum[] = new int [score.length];
	    for(int i = 0; i<score.length; i++) {
	    	for(int j = 0; j<score[i].length; j++) {
	    		sum[i] += score[i][j];
	    	}
	    }
	    return(sum);
	}//합계
	
	public static int[] getRank(int max[], int sum[]) {
		for(int i = 0; i < sum.length; i++) {
			if(max[0] < sum[i]) {
				max[0] = sum[i];
				max[1] = i+1;
			}
		}
		return(max);
	}//등수
	
	public static void printResult(int[][] score, int sum[], int max[]) {
		int i;
	      System.out.println("------------------------------------");
	      System.out.println("\t" + "완성도" + "\t" + "창의성" + "\t" + "이해도" + "\t" + "총점");
	      for(i = 0; i < score.length; i++) {
	         System.out.print((i + 1) + "조" );
	         for(int j = 0; j < score[i].length; j++) {
	            System.out.print("\t" + score[i][j]);

	         }
	         System.out.print("\t" + sum[i]);
	         System.out.println();
	      }
	      System.out.println("------------------------------------");
	      System.out.println("최고팀 : " + max[1] + "조" + " --> " + "점수 : " + max[0]);
	}//출력
	
}
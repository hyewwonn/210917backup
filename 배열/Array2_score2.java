package �迭;

import java.util.Scanner;

public class Array2_score2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int sum[] = new int [score.length];
		int max[] = new int [2];
	    //����
		
	    int rtinput[][] = inputScore(score, scan); //�Է�
		int rtsum[] = getSumScore(score); //�հ�
		int rtrank[] = getRank(max, rtsum); //���
		printResult(score, rtsum, rtrank); //���

	}
	public static int[][] inputScore(int score[][], Scanner scan) {
		for(int i = 0; i<score.length; i++) {//��      
			for(int j = 0; j<score[i].length; j++) {//��
	        	 System.out.print(i+1+"�� ");
	            switch(j+1) {
	            case 1: System.out.print("�ϼ��� �Է� : "); break;
	            case 2: System.out.print("â�Ǽ� �Է� : "); break;
	            case 3: System.out.print("���ص� �Է� : "); break;
	            }
	            score[i][j] = scan.nextInt();
	            while(score[i][j]<0 || score[i][j]>=20) {
	            	System.out.print("���Է� : ");
	            	score[i][j] = scan.nextInt(); //��ȿ��
	            }
	         }
		}
		return(score);
	}//�Է�
	
	public static int[] getSumScore(int score[][]) {
		int sum[] = new int [score.length];
	    for(int i = 0; i<score.length; i++) {
	    	for(int j = 0; j<score[i].length; j++) {
	    		sum[i] += score[i][j];
	    	}
	    }
	    return(sum);
	}//�հ�
	
	public static int[] getRank(int max[], int sum[]) {
		for(int i = 0; i < sum.length; i++) {
			if(max[0] < sum[i]) {
				max[0] = sum[i];
				max[1] = i+1;
			}
		}
		return(max);
	}//���
	
	public static void printResult(int[][] score, int sum[], int max[]) {
		int i;
	      System.out.println("------------------------------------");
	      System.out.println("\t" + "�ϼ���" + "\t" + "â�Ǽ�" + "\t" + "���ص�" + "\t" + "����");
	      for(i = 0; i < score.length; i++) {
	         System.out.print((i + 1) + "��" );
	         for(int j = 0; j < score[i].length; j++) {
	            System.out.print("\t" + score[i][j]);

	         }
	         System.out.print("\t" + sum[i]);
	         System.out.println();
	      }
	      System.out.println("------------------------------------");
	      System.out.println("�ְ��� : " + max[1] + "��" + " --> " + "���� : " + max[0]);
	}//���
	
}
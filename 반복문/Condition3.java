package ¹Ýº¹¹®;

import java.util.Scanner;

public class Condition3 {
	/*Å¥ºê ¿¬¿¹ÀÎ ¾ÆÅ°³×ÀÌÅÍ*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		int idol = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Å¥ºê ¾ÆÀÌµ¹À» »ý°¢ÇÏ¼¼¿ä(¿¹ 1, ¾Æ´Ï¿À 2) : ");
		answer = scan.nextInt();
		if(answer == 1) {
			System.out.print("¿©ÀÚÀÎ°¡¿ä? : ");
			answer = scan.nextInt();
			if(answer ==1) {//¿©ÀÚ
				System.out.print("¸â¹ö°¡ 6¸í ÀÌ»óÀÎ°¡¿ä? : ");
				answer = scan.nextInt();
				if(answer == 1) {//½æ ¯‚
					System.out.print("¸â¹ö Áß ÁßÇÐ»ýÀÌ ÀÖ³ª¿ä? : ");
					answer = scan.nextInt();
					if(answer == 1) {//½æ
						idol = 5;
						getCubeIdol(idol);
					}
					else {//¯‚
						idol = 2;
						getCubeIdol(idol);
					}
				}
				else {//µé
					idol = 4;
					getCubeIdol(idol);
				}
			}
			else {//³²ÀÚ
				System.out.print("±×·ìÀ¸·Î ¼Ò¼ÓµÇ¾î ÀÖ³ª¿ä? : ");
				answer = scan.nextInt();
				if(answer == 1) {//•» Ææ
					System.out.print("µ¥ºß°îÀÌ ºñ¹ÐÀÎ°¡¿ä? : ");
					answer = scan.nextInt();
					if(answer == 1) {//•»
						idol = 1;
						getCubeIdol(idol);
					}
					else {//Ææ
						idol = 3;
						getCubeIdol(idol);
					}
				}
				else {//±Ç ¼±
					System.out.print("ÇÁ·Îµà½º¿¡ ³ª¿Ô³ª¿ä? : ");
					answer = scan.nextInt();
					if(answer == 1) {//¼±
							
						idol = 6;
						getCubeIdol(idol);
					}
					else {//±Ç
						idol = 0;
						getCubeIdol(idol);
					}
				}
					
			}
		}	
		else {//½ÃÀÛ¾ÈÇÔ
			System.out.println("Á¾·áÇÕ´Ï´Ù");
		}
			
	}

	public static void getCubeIdol(int idol) {
		System.out.print("»ý°¢ÇÑ Å¥ºê ¾ÆÀÌµ¹Àº ");
		switch(idol) {
		case 0: System.out.println("Á¶±Ç"); break;
		case 1: System.out.println("ºñÅõºñ"); break;
		case 2: System.out.println("¾¾¿¤¾¾"); break;
		case 3: System.out.println("ÆæÅ¸°ï"); break;
		case 4: System.out.println("(¿©ÀÚ)¾ÆÀÌµé"); break;
		case 5: System.out.println("¶óÀÕ½æ"); break;
		case 6: System.out.println("À¯¼±È£"); break;
		}
	}

}

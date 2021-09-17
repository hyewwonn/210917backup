package JS;

public class Section {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int s = 1; s <= 50; s++){
			sum += s;
			if(s%5==0){
				System.out.println(1+" ~ "+s+" --> "+sum);
			}
		}
		
	}//end of main
}

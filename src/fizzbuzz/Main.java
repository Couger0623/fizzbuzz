package fizzbuzz;

public class Main {

	public static void main(String[] args) {
		
		
		
		for(int i = 1; i < 101; i++){
			String fb = i + ":";
			if(i % 3 == 0 ) {
				fb += "fizz";
			}
			
			if(i % 5 == 0) {
				fb += "bazz";
			}
			System.out.println(fb);
		}
		

	}

}

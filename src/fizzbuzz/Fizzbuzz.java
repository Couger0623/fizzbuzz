package fizzbuzz;

public class Fizzbuzz {

	public void fizzbuzz() {
		for (int i = 1; i < 101; i++) {
			String sys = fb(i);
			System.out.println(sys);
		}
	}
	
	public String fb(int i) {
		String a = fizz(i);
		String s = i + ":";
		return s + a;
	}
	
	
	

	public String fizz(int i) {
		String fb = "";
		if (i % 3 == 0) {
			fb += "fizz";
		}

		if (i % 5 == 0) {
			fb += "bazz";
		}
		
		if(i % 8 == 0 ) {
			fb += "Hoge";
		}
		
		if(i % 15 == 0) {
			fb += "nyan";
		}
			return fb;
	
	}

}

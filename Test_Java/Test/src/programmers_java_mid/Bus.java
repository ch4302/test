package programmers_java_mid;

public class Bus extends Car implements Runnable {
	String str;
	
	public Bus() {
		
	}
	
	public Bus(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(str);
		}
	}
}

package programmers_java_mid;

public class RunnableExam {

	public static void main(String[] args) {
		Bus bus = new Bus("버스가 달립니다.");
		
		Thread busThread = new Thread(bus);
		busThread.start();
		
		System.out.println("Main End");
	}
}

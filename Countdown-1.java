import java.util.*;

public class Countdown implements Runnable {
	
	String name;
	int time;
	
	public Countdown(String n) {
		name = n;
	}
	
	public void run() {
		try {
			for (time = 5; time != 0; time--) {
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			System.out.println("No result");
		}
     }
}
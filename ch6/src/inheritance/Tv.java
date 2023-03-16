package inheritance;

public class Tv {
	public class SmartTv {

	}
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

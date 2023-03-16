package ch6;
public class Tv3 {
	
	private String color; //색상
	private int channel;  //채널
	private boolean power;//전원상태

	
	
	
	public Tv3() {
		super();
		
	}
	

	public Tv3(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
	}





	void power() {
		power = !power;
	}
	
	
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}

	//getter/setter 메서드
	//getter : 변수의 값을 리턴하는 형태
	public String getColor() {  //get 메서드
		return color;
	}

	//setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {  //set 메서드
		this.color = color;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	
}

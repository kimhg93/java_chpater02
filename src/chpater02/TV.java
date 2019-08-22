package chpater02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	private int channelMax = 255;
	private int volumeMax = 100;
	private int min = 0;
	
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;		
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void isPower() {
		
	}
	public void power(boolean on) {
		if(on) {
			System.out.println("전원이 켜짐");
		}else {
			System.out.println("전원이 꺼짐");
		}
	}
	public void channel(int channel) {
		if(channel>=channelMax){
			this.channel = channelMax;
		}else if(channel<min){
			this.channel = 0;
		}else {
			this.channel = channel;
		}		
		System.out.println("채널:"+this.channel);
	}
	
	public void channel(boolean up) {
		if(up) {
			if(channel==255) 
				channel=0;		
			channel++;
			System.out.println("채널:"+channel);
		}else {
			
			if(channel==1)
				channel=0;				
			channel-=1;
			System.out.println("채널:"+channel);
		}
	}
	
	
	public void volume(int volume) {
		if(this.volume>=volumeMax){
			this.volume = volumeMax;
		}else if(volume<min){
			this.volume = 0;
		}else {
			this.volume = volume;
		}
		System.out.println("볼륨:"+this.volume);
	}
	
	
	
	public void volume(boolean up) {
		if(up) {
			if(volume!=volumeMax)
			volume++;
			System.out.println("볼륨:"+volume);
		}else {
			if(volume!=min)
			this.volume--;
			System.out.println("볼륨:"+volume);
		}
	}
	
	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	
	
}

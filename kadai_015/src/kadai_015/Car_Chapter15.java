package kadai_015;

public class Car_Chapter15 {
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	private int gear;
	private int speed;
	
	Car_Chapter15(){
		this.gear=1;
		this.speed=10;
	}
	
	public void gearChange(int afterGear) {
		if(afterGear==1) {
			System.out.println("ギア１に切り替えました");
		}else if(afterGear==2) {
			System.out.println("ギア１から2に切り替えました");
		}else if(afterGear==3) {
			System.out.println("ギア１から3に切り替えました");
		}else if(afterGear==4) {
			System.out.println("ギア１から4に切り替えました");
		}else if(afterGear==5) {
			System.out.println("ギア１から5に切り替えました");
		}else {
			System.out.println("ギア１に切り替えました");
		}
		
	}
	
	public void run() {
		System.out.println("速度は時速30kmです");
	}
}

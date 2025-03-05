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
			this.gear=1;
			this.speed=10;
		}else if(afterGear==2) {
			this.gear=2;
			this.speed=20;
		}else if(afterGear==3) {
			this.gear=3;
			this.speed=30;
		}else if(afterGear==4) {
			this.gear=4;
			this.speed=40;
		}else if(afterGear==5) {
			this.gear=5;
			this.speed=50;
		}else {
			this.speed=10;
		}
		
	}
	
	public void run() {
		if(this.speed==10) {
			System.out.println("ギア1から1に切り替えました");
			System.out.println("速度は時速10kmです");
		}else if(this.speed==20) {
			System.out.println("ギア1から2に切り替えました");
			System.out.println("速度は時速20kmです");
		}else if(this.speed==30) {
			System.out.println("ギア1から3に切り替えました");
			System.out.println("速度は時速30kmです");
		}else if(this.speed==40) {
			System.out.println("ギア1から4に切り替えました");
			System.out.println("速度は時速40kmです");
		}else if(this.speed==50) {
			System.out.println("ギア1から5に切り替えました");
			System.out.println("速度は時速50kmです");
		}else{
			System.out.println("速度は時速10kmです");
		}
	}
}

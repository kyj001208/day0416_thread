package thread;

import java.util.Random;

class Horse extends Thread {

	private static final int MAX_DISTANCE = 100;

	private int distance = 0;

	private Random random = new Random();

	public Horse(String name) {

		super(name);

	}

	@Override
	public void run() {
	
		while(distance <MAX_DISTANCE ) {
			
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			distance += random.nextInt(5);
			System.out.println(getName()+"마 " + distance+" 미터 달리는 중!" );
			
			
		}
		
		System.out.println(getName()+" 마 결승점 통과----------------");
		
	}

}

public class HorseRace {

	public static void main(String[] args) {
		
		Horse [] hors={new Horse("1. 3Y"),new Horse("2. 새로"),new Horse("3. 아졸"),new Horse("4. 러그레츠"), new Horse("5. 유닛") };
		
		
		for(int i=0;i<hors.length; i++) {
			
			hors[i].start();
			
		}
		
		System.out.println("========================메인이 종료되는 시점==========================================================");
		
		
		
		
		
		

	}

}

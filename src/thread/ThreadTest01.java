package thread;

class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"main메서드처럼 동작하는 메서드");
	}
	
	
	
}


class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread()+"main 메서드 처럼 동작하는 메서드");
		
	}
	
	
}

public abstract class ThreadTest01 {

	public static void main(String[] args) {
		
		MyThread my=new MyThread();
		my.setPriority(10);// 1~10까지
		my.setName("유진이의 스레드");
		
		my.start();//run()실행해준다
		
		Runnable my3=new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		};
		
		Runnable my4=()->{System.out.println(Thread.currentThread()+"실행!");};
		
		Thread my1=new Thread(my4);
		my1.start();
		
		
		
		
		Thread my2=new Thread(new MyThread2()); //Runnable의 객체
		
		my2.start();
		
	}

}

package Threads;
class thrd1 extends Thread{
	public void run() {
		for (int i=0;i<15;i++) {
			System.out.println("HI..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class thrd2 extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("HELLO..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class thrd3 extends Thread{
	public void run() {
		for (int i=0;i<1;i++) {
			System.out.println("TEST..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class thredex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrd1 t1=new thrd1();
		thrd2 t2=new thrd2();
		thrd3 t3=new thrd3();
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			
		}
		t1.start();
		
		t3.start();
	}

}

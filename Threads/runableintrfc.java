package Threads;
class thrdr implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("TEST..");
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		}
	}
	
}

public class runableintrfc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrdr trd1=new thrdr();
		Thread t1=new Thread(trd1);
		t1.start();
	}

}

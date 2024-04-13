package Threads;
class thrd extends Thread{
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
public class thrdgetsetnm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrd t1=new thrd();
		System.out.println(t1.getName());
		t1.setName("Suresh");
		System.out.println(t1.getName());
		t1.start();
	}

}

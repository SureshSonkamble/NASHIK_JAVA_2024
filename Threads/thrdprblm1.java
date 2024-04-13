package Threads;
class th1{
	void hi() {
		for (int i=0;i<15;i++) {
			System.out.println("HI..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
		void hello() {
			for (int i=0;i<5;i++) {
				System.out.println("HEll0..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}
		void test() {
				for (int i=0;i<1;i++) {
					System.out.println("TEST..");
				}		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
	}
}


public class thrdprblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th1 th=new th1();
		th.hi();
		th.hello();
		th.test();
	}

}

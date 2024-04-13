package Threads;
class tbl{
  synchronized	void prnttbl(int n) {
		for(int i=1;i<=20;i++) {
			System.out.println(i*n);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
		}
		System.out.println("===================================");
	}
}
class tthd1 extends Thread{
	tbl t1;
	tthd1(tbl t1){
		this.t1=t1;
	}
	public void run() {
		t1.prnttbl(5);
	}
}

class th2 extends Thread{
	tbl t1;
	th2(tbl t1){
		this.t1=t1;
	}
	public void run() {
		t1.prnttbl(8);
	}
}

class th3 extends Thread{
	tbl t1;
	th3(tbl t1){
		this.t1=t1;
	}
	public void run() {
		t1.prnttbl(9);
	}
}
public class sysnkjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tbl obj =new tbl();
		   tthd1 t1=new tthd1(obj);
           th2 t2=new th2(obj);
           th3 t3=new th3(obj);
           
           t1.start();
           t2.start();
           t3.start();
           
	}

}

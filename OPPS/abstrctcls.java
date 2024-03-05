package OPPS;
abstract class bmw{
	void info() {
		System.out.println("$9898,US");	
	}
	abstract void enifo();
}
class engineer extends bmw{
	void eng() {
		System.out.println("I am car engineer");
	}

	void enifo() {
		System.out.println("12000 CC");	
	}
}
class emp extends bmw {
	@Override
	void enifo() {
		// TODO Auto-generated method stub
		System.out.println("1000cc-12000 CC");	
	}
}
public class abstrctcls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // bmw b=new bmw();
		engineer e=new engineer();
		e.eng();
		e.info();
		e.enifo();
		emp em=new emp();
		em.enifo();
	}

}

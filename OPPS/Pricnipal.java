package OPPS;

public class Pricnipal {

	public static void main(String[] args) {
		
		common cm=new common();
		cm.dt();
		cm.time();
		//object creation
		Arts aa=new Arts();
		aa.ainfo();
		aa.notice();
		System.out.println("Arts Studnt count:"+aa.acnt);
		Comm cc=new Comm();
		cc.cminfo();
		cc.notice();
		
		System.out.println("commrce Studnt count:"+cc.ccnt);
        Sci ss=new Sci();
        ss.sinfo();
        ss.notice();
	}

}

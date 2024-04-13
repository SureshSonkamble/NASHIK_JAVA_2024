package OPPS;
interface gpft{
	void p();
}
interface gpft2{
	void p();
}
interface ft1 extends gpft,gpft2{
	void p();
}
interface ft2{
	void p();
}
class iflcls implements ft1,ft2{
	@Override
	public void p() {
    System.out.println("Multple inheritance concept acheived");		
	}
	
}
public class mulintrfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iflcls i=new iflcls();
		i.p();
	}

}

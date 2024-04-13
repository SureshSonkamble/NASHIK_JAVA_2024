package collection;

import java.util.ArrayList;
import java.util.Collections;

public class arlsttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Students> al=new ArrayList<Students>();  
		al.add(new Students(101,"Vijay",23));  
		al.add(new Students(106,"Ajay",27));  
		al.add(new Students(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
	
		for(Students st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}

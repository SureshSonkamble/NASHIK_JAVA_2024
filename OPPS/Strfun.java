package OPPS;

public class Strfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="CodingShika";
           String ss="CoDingShiKa";
           System.err.println(s.charAt(5));
           System.err.println(s.indexOf('g'));
//           System.out.println(s.toUpperCase());
//           System.out.println(s.toLowerCase());
//           //index start with 0
//           System.out.println(s.length());
//           System.err.println(s.charAt(5));
//           System.err.println(s.substring(6));
//           System.err.println(s.substring(0,6));
//           System.out.println(s.contains("ka"));
           System.out.println(s.equals(ss));
           System.out.println(s.equalsIgnoreCase(ss));
//           String s1="90ML";
//           String s2="180ML";
//       	   String s3="2000ML";
//       	   
//       	System.out.println(s3.substring(0,s3.length()-2));
           
           String s1="Nashik";
           String s2="India";
           System.out.println(s1.concat(s2));
	}

}

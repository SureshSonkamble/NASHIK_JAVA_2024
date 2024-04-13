package Threads;

import java.io.IOException;
import java.util.Scanner;

public class runtme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter things to be search on google:");
		String url=sc.next();
        try {
        	//String url = "http://www.codingshika.com";
        	//String url = "www.facebook.com";
			//Runtime.getRuntime().exec("C:\\Users\\Suresh\\OneDrive\\Desktop\\YEARKEYGENERATOR");
			//Runtime.getRuntime().exec("mspaint.exe");
			//Runtime.getRuntime().exec("cmd /c start excel.exe");
			//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "https://www.google.com/search?q="+url);
			Runtime.getRuntime().exec("https://www.google.com/search?q="+url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

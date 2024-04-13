package BASIC;

import java.util.Arrays;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="00003241";
       char ch[]= s.toCharArray();
       //Arrays.sort(ch);
       for (int i=0;i<ch.length;i++) {
    	   for (int j=i+1;j<ch.length;j++) {
        	   if(ch[i]>ch[j]) {
        		   char temp=ch[i];
        		   ch[i]=ch[j];
        		   ch[j]=temp;
        	   }
           }
       }
       System.out.println(ch);
	}

}

package OPPS;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class common {
void dt() {
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
}
 void time()
 {
	 LocalTime time = LocalTime.now();  
	    System.out.println(time);  
 }

}

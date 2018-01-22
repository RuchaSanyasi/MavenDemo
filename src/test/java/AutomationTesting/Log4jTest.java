package AutomationTesting;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Log4jTest {
	
	 static Logger l = Logger.getLogger(Log4jTest.class.getName());
	 
	  public static void main(String[] args) {   
	 
	   Layout l1 = new SimpleLayout();
	   Appender a;
	   //Appender a = new ConsoleAppender(l1);
	   try
	   {
	   a = new FileAppender(l1,"C:\\Users\\intel\\eclipse-workspace\\MavenDemo\\properties\\properties.txt", false);
	 
	   // 3rd parameter is true by default
	   // true = Appends the data into my.txt
	   // false = delete previous data and re-write
	 
	   l.addAppender(a);
	   }
	   catch(Exception e) {}   
	 
	   l.fatal("This is the error message..");
	   System.out.println("Your logic executed successfully....");
	  }
	}   
		 
		 	
	 



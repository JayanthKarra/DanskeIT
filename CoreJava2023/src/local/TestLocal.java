package local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestLocal {
public static void main(String[] args)
{
	LocalDate today = LocalDate.now();  //1 - Recommended
	System.out.print(today);
	
	
	LocalDate dateInstance = LocalDate.parse("2019-03-27");
	System.out.print("\n"+dateInstance);
	
	//1 - default date pattern
	String date = "2019-03-23";
	LocalDate localDate = LocalDate.parse(date);
	System.out.println("\n"+localDate);
	 
	/* //2 - specific date pattern
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
	String date1 = "23-Mar-2019";
	LocalDate localDate1 = LocalDate.parse(date1, formatter);
	System.out.println("\n"+localDate1);
	
	//3. format LocalDate to string
	
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");	 
	LocalDate today1 = LocalDate.now();	 
	String dateString = today1.format(formatter1);    //23-Mar-2019*/
}
}

package locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class TestLocale {
public static void main(String [] main)
{
	Locale usLocale = Locale.US;
	 
	long number = 123456789L;
	NumberFormat nf = NumberFormat.getInstance(usLocale);
	System.out.println( nf.format(number) );     //123,456,789
	 
	Date now = new Date();
	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
	System.out.println( df.format(now) );    //July 19, 2016 12:43:12 PM IS
	
	
	Locale.setDefault(Locale.FRANCE);
	long number1 = 123456789L;
	System.out.println( nf.format(number1) ); 
	
}
}

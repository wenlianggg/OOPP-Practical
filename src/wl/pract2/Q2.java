package wl.pract2;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;
// Supposedly CalendarApp.java

public class Q2 {
	public static void main(String[] args) {
	GregorianCalendar cal = new GregorianCalendar();
	DecimalFormat df = new DecimalFormat("00");
	System.out.println(df.format(cal.get(GregorianCalendar.DAY_OF_MONTH)) + "-" + df.format(cal.get(GregorianCalendar.MONTH) + 1) + "-" + cal.get(GregorianCalendar.YEAR));
	GregorianCalendar bday = new GregorianCalendar(1998, 2, 17);
	System.out.println(df.format(bday.get(GregorianCalendar.DAY_OF_MONTH)) + "-" + df.format(bday.get(GregorianCalendar.MONTH) + 1) + "-" + bday.get(GregorianCalendar.YEAR));
	}
}

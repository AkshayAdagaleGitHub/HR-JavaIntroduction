import java.util.Calendar;
import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class Solution {
	
	public static String getDay(String day,String month,String year){
	    int dd=Integer.parseInt(day);
	    int mm = Integer.parseInt(month);
	    int yy=Integer.parseInt(year);
	    LocalDate dt = LocalDate.of(yy, mm, dd);
	    //System.out.print(dt.getDayOfWeek());
	    String d=  dt.getDayOfWeek().toString();
	    return d;
	}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    System.out.println(getDay(day, month, year));
}
}
//08 05 2015
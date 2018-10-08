import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	        us.setMaximumFractionDigits(2);
	        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        ch.setMaximumFractionDigits(2);
	        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        fr.setMaximumFractionDigits(2);
	        
	        Locale indian = new Locale("en","IN");
	        NumberFormat in = NumberFormat.getCurrencyInstance(indian); 
	        
	        System.out.println("US:" + us.format(payment));
	        System.out.println("India: " + in.format(payment));
	        System.out.println("China: \u00A5" + ch.format(payment));
	        System.out.println("France: " + fr.format(payment) +"\u20AC");

	}

}
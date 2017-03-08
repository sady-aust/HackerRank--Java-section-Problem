import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
        String in = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String chi = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + chi);
        System.out.println("France: " + fr);
    }
}
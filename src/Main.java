
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static DecimalFormat formatter;

    static int code;
    static double amount;

    static double dollar;
    static double pound;
    static double euro;
    static double yen;
    static double ringgit;
    static double rupee;

    public static void main(String[] args) {

        formatter = new DecimalFormat("##.##");
        scanner = new Scanner(System.in);

        System.out.println("hi, Welcome to the Currency Converter!");
        System.out.println("which currency You want to Convert ? ");
        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit");

        code = scanner.nextInt();

        System.out.println("How much Money you want to convert ?");
        amount = scanner.nextFloat();

        scanner.close();

        if (code == 1) {
            // For Ruppes Conversion

            dollar = amount / 70;
            pound = amount / 88;
            euro = amount / 80;
            yen = amount / 0.63;
            ringgit = amount / 16;
        } else if (code == 2) {
            // For Dollar Conversion

            rupee = amount * 70;
            pound = amount * 0.78;
            euro = amount * 0.87;
            yen = amount * 111.087;
            ringgit = amount * 4.17;
        } else if (code == 3) {
            // For Pound Conversion

            rupee = amount * 88;
            dollar = amount * 1.26;
            euro = amount * 1.10;
            yen = amount * 140.93;
            ringgit = amount * 5.29;
        } else if (code == 4) {
            // For Euro Conversion

            rupee = amount * 80;
            dollar = amount * 1.14;
            pound = amount * 0.90;
            yen = amount * 127.32;
            ringgit = amount * 4.78;
        } else if (code == 5) {
            // For Yen Conversion

            rupee = amount * 0.63;
            dollar = amount * 0.008;
            pound = amount * 0.007;
            euro = amount * 0.007;
            ringgit = amount * 0.037;
        } else if (code == 6) {
            // For Ringgit Conversion
            rupee = amount * 16.8;
            dollar = amount * 0.239;
            pound = amount * 0.188;
            euro = amount * 0.209;
            yen = amount * 26.63;
        }

        printResult(code);
        System.out.println("Thank you for choosing our Example Programs");
    }

    static void printResult(int selection) {

        String[] currencies = { "Rupee", "Dollar", "Pound", "Euro", "Yen", "Ringgit" };

        if (selection <= 6 && selection >= 1) {
            if (selection != 1) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : "
                        + formatter.format(rupee) + " Ruppes");
            }
            if (selection != 2) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : "
                        + formatter.format(dollar) + " Dollar");
            }
            if (selection != 3) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : "
                        + formatter.format(pound) + " Pound");
            }
            if (selection != 4) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : "
                        + formatter.format(euro) + " Euro");
            }
            if (selection != 5) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : " 
                        + formatter.format(yen) + " Yen");
            }
            if (selection != 6) {
                System.out.println("Your " + amount + " " + currencies[selection - 1] + " is : "
                        + formatter.format(ringgit) + " Ringgit");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

}
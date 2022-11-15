import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

        public static void main(String[] args) {

                double amount, dollar, pound, code, euro, Dollar, Pound, Euro, DOLLAR, POUND, EURO;

                DecimalFormat f = new DecimalFormat("##.##");

                amount = Integer.parseInt(args[0]);
                String currency = args[1];

                // For amounts Conversion
                switch (currency){
			case "default":
                                System.out.println("Please input a Currency you wish to convert");
                                break;

                 	case "dollars":
                                // For Dollar Conversion
                                pound = amount * 0.74;
                                System.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");
                                euro = amount * 0.88;
                                System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");
                                break;
                        case "pounds":
                                // For Pound Conversion
                                dollar = amount * 1.36;
                                System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");
                                euro = amount * 1.19;
                                System.out.println(amount + " Pound = " + f.format(euro) + " Euros");
                                break;
                        case "euros":
                                // For Euro Conversion
                                dollar = amount * 1.31;
                                System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");
                                pound = amount * 0.84;
                                System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");
                                break;
 			case "Dollars":
                                Pound = amount * 0.74;
                                System.out.println(amount + " Dollars = " + f.format(Pound) + " Pounds");
                                Euro = amount * 0.88;
                                System.out.println(amount + " Dollars = " + f.format(Euro) + " Euros");
                                break;
                        case "Pounds":
                                Dollar = amount * 1.36;
                                System.out.println(amount + " Pounds = " + f.format(Dollar) + " Dollars");
                                Euro = amount * 1.19;
                                System.out.println(amount + " Pound = " + f.format(Euro) + " Euros");
                                break;
                        case "Euros":
                                Dollar = amount * 1.31;
                                System.out.println(amount + " Euros = " + f.format(Dollar) + " Dollars");
                                Pound = amount * 0.84;
                                System.out.println(amount + " Euros = " + f.format(Pound) + " Pounds");
                                break;
                        case "DOLLARS":
                                POUND = amount * 0.74;
                                System.out.println(amount + " Dollars = " + f.format(POUND) + " Pounds");
                                EURO = amount * 0.88;
                                System.out.println(amount + " Dollars = " + f.format(EURO) + " Euros");
                                break;
                        case "POUNDS":
                                DOLLAR = amount * 1.36;
                                System.out.println(amount + " Pounds = " + f.format(DOLLAR) + " Dollars");
                                EURO = amount * 1.19;
                                System.out.println(amount + " Pound = " + f.format(EURO) + " Euros");
                                break;
                        case "EUROS":
                                DOLLAR = amount * 1.31;
                                System.out.println(amount + " Euros = " + f.format(DOLLAR) + " Dollars");
                                POUND = amount * 0.84;
                                System.out.println(amount + " Euros = " + f.format(POUND) + " Pounds");
                                break;
                }
                System.out.println("Thank you for using the converter.");
        }

}


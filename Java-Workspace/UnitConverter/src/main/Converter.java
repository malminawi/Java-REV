package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		conversions conversions =  new conversions();

		int firstMenuSelection = 0;
		char secondMenuSelection;
		double quantity;
		
		Scanner myScanner = new Scanner(System.in);
		
		while(firstMenuSelection != 4) {
			
		
		System.out.println("Please select the type of conversion you want...\n");
		System.out.println("1- Volume Conversions\n2- Distance Conversions\n3- Tempreture Conversions\n4- Quit");
		
		firstMenuSelection = myScanner.nextInt();
		
		if(firstMenuSelection == 1) {
			System.out.println("\n Please select the Volume conversion you want...\n");
			System.out.println("a- Teaspoons to Cups\nb- Cups to Teaspoons\nc- Gallons to Imperial\nd- Imperial to 1"
					+ "Gallons\ne- Quit");
			secondMenuSelection = myScanner.next().charAt(0);
			
			switch (Character.toLowerCase(secondMenuSelection)) {
			case 'a':
				System.out.println("\n Please  enter the teaspoon/s quantity\n");
				quantity = myScanner.nextInt();
				System.out.println(quantity + " teaspoon/s is equals to: "+ conversions.TeaSpoonToCup(quantity) + " Cup/cups \n\n");
				break;
			case 'b':
				System.out.println("\n Please  enter the cups/s quantity\n");
				quantity = myScanner.nextInt();
				System.out.println(quantity + " cup/s is equals to: "+ conversions.CupsToTeaSpoon(quantity) + " teaspoon/s\n\n" );
				break;
			case 'c':
				System.out.println("\n Please enter the gallons/s quantity\n");
				quantity = myScanner.nextInt();
				System.out.println(quantity + " gallon/s is equals to: "+ conversions.gallonsToImperial(quantity) + " Imperial/s\n\n");
				break;
			case 'd':
				System.out.println("\n Please enter the Imperial/s quantity\n");
				quantity = myScanner.nextInt();
				System.out.println(quantity + " imperial/s is equals to: "+ conversions.imperialToGallons(quantity) + " gallon/s\n\n");
				break;
			case 'e':
				System.out.println("\n Thank you!!\n");
				break;
			default:
				System.out.println("\n Please enter a single character, or 'e' to quit\n");
				break;

			}
		}
			
			if(firstMenuSelection == 2) {
				System.out.println("\n Please select the Distance conversion you want...\n");
				System.out.println("a- Miles to Killomater\nb- Killometer to Miles\nc- Quit");
				secondMenuSelection = myScanner.next().charAt(0);
				
				switch (Character.toLowerCase(secondMenuSelection)) {
				case 'a':
					System.out.println("\n Please  how many mile/s \n");
					quantity = myScanner.nextInt();
					System.out.println(quantity + " mile/s is equals to: "+ conversions.MtoK(quantity) + " killometer/s\n\n");
					break;
				case 'b':
					System.out.println("\n Please  enter the Killometer/s quantity\n");
					quantity = myScanner.nextInt();
					System.out.println(quantity + " Killometer/s is equals to: "+ conversions.KtoM(quantity) + " mile/s\n\n");
					break;
				case 'c':
					System.out.println("\n Thank you!!\n");
					break;
				default:
					System.out.println("\n Please enter a single character, or 'c' to quit\n");
					break;

				}
			}
				if(firstMenuSelection == 3) {
					System.out.println("\n Please select the Tempreture conversion you want...\n");
					System.out.println("a- Celsius to Farenheit\nb- Farenheit to Celsius\nc- Quit");
					secondMenuSelection = myScanner.next().charAt(0);
					
					switch (Character.toLowerCase(secondMenuSelection)) {
					case 'a':
						System.out.println("\n Please  enter Celsius value \n");
						quantity = myScanner.nextInt();
						System.out.println(quantity + " in Celsius  is equals to: "+ conversions.CelsiusToFarenheit(quantity) + " in Farenheit\n\n");
						break;
					case 'b':
						System.out.println("\n Please  enter the Farenheit/s quantity\n");
						quantity = myScanner.nextInt();
						System.out.println(quantity + " Farenheit is equals to: "+ conversions.FarenheitToCelsius(quantity) + "  in  Celsius\n\n");
						break;
					case 'c':
						System.out.println("\n Thank you!!\n\n");
						break;
					default:
						System.out.println("\n Please enter a single character, or 'c' to quit\n\n");
						break;

					}

			
		}
		}
		
		
//		System.out.println(CtoF.CelsiusToFarenheit(25));
//		
//		System.out.println(FtoC.FarenheitToCelsius(98.6));
//		
//		
	}

}
		

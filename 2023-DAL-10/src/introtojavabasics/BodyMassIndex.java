/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author homeoffice
 *
 */
public class BodyMassIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weightinKg,bmi,heightInMeters;
		System.out.println("What is your weight");
		weightinKg = scanner.nextDouble();
		System.out.println("What is your height");
		heightInMeters = scanner.nextDouble();
		String interpretation= "";
		bmi = weightinKg / (heightInMeters *heightInMeters);
		
		//Determine the interpretation
		if(bmi<18.5) {
			interpretation = "Underweight";
		}
		else  if(bmi>= 18.5 && bmi <25.0) {
			interpretation = "Normal";
		}
		else if(bmi>=25.0 && bmi <30.0){
			interpretation  = "Overweight";
		}
		else if (bmi>30)
			interpretation = "Obese";
		//Formatted the string using string.format()
		System.out.format("You BMI for %s Kg and %sm is %f and you are allegdly %s%n" ,weightinKg,heightInMeters,bmi,interpretation);
		/*Format the BMI output using your favorite 
		type of formatting in Java and thanks to Nequil
		interpret this code using pounds instead of KG
		and thanks to Daisy use inches instead of meters
		*/
		
		//Interpret the above code for inches and pounds
		double weightinPounds,heightInIches;
		System.out.println("What is your weight");
		weightinPounds = scanner.nextDouble();
		System.out.println("What is your height");
		heightInIches = scanner.nextDouble();
		bmi = weightinPounds / (heightInIches *heightInIches) *703;
		
		//Determine the interpretation
		if(bmi<18.5) {
			interpretation = "Underweight";
		}
		else  if(bmi>= 18.5 && bmi <25.0) {
			interpretation = "Normal";
		}
		else if(bmi>=25.0 && bmi <30.0){
			interpretation  = "Overweight";
		}
		else if (bmi>30)
			interpretation = "Obese";
		//Formatted the string using string.format()
		System.out.format("You BMI for %s pounds and %s inches is %f and you are allegdly %s" ,weightinPounds,heightInMeters,bmi,interpretation);
		scanner.close();

		
	}

}
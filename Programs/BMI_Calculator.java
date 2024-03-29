import java.util.*;

public class BMI_Calculator{
    /* Function for converting kg to pounds */
    public static double kilogramToPound(double kilogram){
        double pounds = kilogram * 2.2;
        return pounds;
    }
    /* Function for converting cm to inches */
    public static double centimetresToInches(double centimetres){
        double inches = centimetres * 0.39;
        return inches;
    }
    /* Function for calculating BMI */
    public static double bmi_calc(double weight, double height){
        double bmi = (weight * 703) / (height * height);
        return bmi;
    }

    public static void main(String []args){
     	Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight (in kg) and height (in cm) separated by a space: ");
     	String s = sc.nextLine();
        s = s.trim();

        double height = Double.valueOf(s.substring(s.indexOf(" ")+1,s.length()));
        double weight = Double.valueOf(s.substring(0,s.indexOf(" ")));

        weight = kilogramToPound(weight);
        height = centimetresToInches(height);

        double bmi = bmi_calc(weight, height);
        System.out.printf("%.2f",bmi);
        System.out.println();

        if (bmi >= 15 && bmi < 19)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
    }
}
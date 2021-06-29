package ex1;

public class ConversionUtil {
    public static double fahrenheitToCelsius(double fDegree){
        return (fDegree-32)/1.8;
    }

    public static double celsiusToFahrenheit(double cDegree){
        return cDegree * (1.8) + 32;
    }

    public static void main(String[] args) {

        double f = 100;
        double c = fahrenheitToCelsius(f);
        System.out.printf("%.1f degrees F = %.1f degrees C\n", f, c);
        double c1 = 40;
        double f1 = celsiusToFahrenheit(c1);
        System.out.printf("%.1f degrees C = %.1f degrees F", c1, f1);

    }


}
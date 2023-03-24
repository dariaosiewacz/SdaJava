import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

    //Zadanie 14

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę w kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Podaj wzrost w m: ");
        double growth = scanner.nextDouble();
//        double bmi = weight / (growth*growth);
        double bmi = weight / Math.pow(growth,2);
        System.out.println("twoje bmi: " + bmi);
        System.out.println("masz nadwagę: " + (bmi >= 25));
        System.out.println("masz niedowagę: " + (bmi <= 18.49));
        
    }
}

import java.util.Scanner;

public class AgeUser {
    public static void main(String[] args) {

    //Zadanie 15//

        Scanner mojSkaner = new Scanner(System.in); //taka jest formuła do użycia scannera
        System.out.print("Podaj wiek:");
        int age = mojSkaner.nextInt();
        System.out.println("Podales: " + age);
        System.out.println("Jesteś \npełnoletni: " + (age >= 18));  //'\n' dodaje nową linię

    }
}

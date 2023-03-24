import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {

        double random = Math.random();// 0 - 1
        random *= 10; // [0, 10)  0.2 -> 0 , 9.99 -> 9, 0.58 -> 0
        random++; // 0.999 -> 9.99 -> 10.99 -> 10
        int secretNumber = (int) random;  // 3.14 -> 3,  3.88 -> 3
        System.out.println(secretNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 10: ");
        int guess = scanner.nextInt();

        if(guess > secretNumber){
            System.out.println("Za wysoko! Spróbuj jeszcze raz!");
        } else if(guess < secretNumber){
            System.out.println("Za nisko! Spróbuj jeszcze raz");
        } else {
            System.out.println("Trafiłeś, gratulacje!");
            return;
        }

        System.out.println("Jeszcze raz zgadnij liczbę od 1 do 10: ");
        guess = scanner.nextInt();

        if(guess > secretNumber){
            System.out.println("Za wysoko!");
        } else if(guess < secretNumber){
            System.out.println("Za nisko!");
        } else {
            System.out.println("Trafiłeś, gratulacje!");
        }
    }
}

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {


        //Zadanie 16
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        System.out.println("Wpisana liczba to: " + liczba);
        if (liczba > 0) {
            System.out.println("liczba dodatnia");
        } else if (liczba < 0) {
            System.out.println("liczba ujemna");
        } else if (liczba == 0) {
            System.out.println("liczba równa 0");
        }

        if (liczba%2 == 0){
            System.out.println("Liczba parzysta");
        }
        else {
            System.out.println("Liczba nieparzysta");
        };


    }
}

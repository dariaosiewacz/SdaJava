import java.util.Scanner;

public class MojeProbneTesty {
    public static void main(String[] args) {
        int myInt = 103;

        System.out.println(myInt % 5); //3

        myInt = myInt + 1; //104
        ++myInt;  //'++ przed' zwiększa wartość o 1 przed użyciem,
        System.out.println(myInt); //105

        --myInt;
        System.out.println(myInt);  //104

        System.out.println(++myInt); //105
        System.out.println(myInt); //105
        System.out.println(myInt++); //105 //wyświetli 105, ale zwiększy na 106
        System.out.println(++myInt); //107

//        int x = 4;
//        int y = 5;
//
//        System.out.println(x = x + y);
//                                           te dwie funkcje/metody można stosować zamiennie
//        System.out.println(x += y);

//        System.out.println("test instrukcji switch");
//        Scanner mojScanner = new Scanner(System.in);
//        System.out.println("Podaj imię: ");
//        String imie = mojScanner.nextLine();
//        switch (imie) {
//            case "Daria":
//                System.out.println("To mama");
//                break;
//            case "Wiktorek":
//                System.out.println("To syn");
//                break;
//            case "Michał":
//                System.out.println("To tata");
//                break;
//            default:
//                System.out.println("Podano nieznane imie");
//        }

        System.out.println("Test pętli for");
        for (int i = 1; i <= 10; i++){
            System.out.println("Wykonuje " + i + " przebieg petli");
            if (i == 5) {
                //break
                continue;
            }
            System.out.println("Instrukcja po if");
        }

        System.out.println("Test pętli while");
        boolean myFlag = true;
        int iter = 0;
        while (myFlag) {
            System.out.print(iter++);
            if (iter == 5) {
                myFlag = false;
            }
            System.out.println("x");
        }

        System.out.println("Test pętli do while");
        int iter2 = 7;
        do {
            System.out.print(iter2++);
            System.out.println("x");
        } while (iter2 < 5);

        System.out.println("Testy tablic");
        String[] mojaTablica = new String[3];
        mojaTablica[0] = "a";
        mojaTablica[1] = "b";
        mojaTablica[2] = "c";
        for (int licznik = 0; licznik < mojaTablica.length; licznik++){
            System.out.println(mojaTablica[licznik]);
        }






    }
}

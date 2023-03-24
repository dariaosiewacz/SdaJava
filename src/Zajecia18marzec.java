public class Zajecia18marzec {
    public static void main(String[] args) {

//        int x = 20;
//        if (x > 0 && x < 25) ;
//        System.out.println("Wiek" + x);


        //przykład
//        int day = 1;
//        switch (day){
//            case 0:
//                System.out.println("?");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//            case 5:
//                System.out.println("piąteczek");
//            default:
//                System.out.println("praca ;(");
//        }

        //Zadanie ...
//        String userType = "gold";
//        switch (userType) {
//            case "standard":
//                System.out.println("Możesz oglądać filmy w jakości HD");
//                break;
//            case "premium":
//                System.out.println("Możesz oglądać filmy w jakości FHD");
//                break;
//            case "gold":
//                System.out.println("Możesz oglądać filmy w jakości 2K");
//                break;
//            case "diamond":
//                System.out.println("Możesz oglądać filmy w jakości 4K");
//                break;
//            default:
//                System.out.println("Nieznany typ użytkownika");

//        String userType = "gold";
//        switch (userType) {
//            case "diamod":
//                System.out.println("4K");
//            case "gold":
//                System.out.println("2K");
//            case "premium":
//                System.out.println("FHD");
//            case "standard":
//                System.out.println("HD");
//                break;
//            default:
//                System.out.println("Nieznany typ");


//        for (int i = 0; i < 8; ++i){
//            System.out.println(i);
//        }

        //Zadanie 18

        //a
//        for (int i = 1; i < 11; ++i){
//            System.out.println(i);
//        }
//
//        //b
//        for (int a = 99; a > 65; --a) {
//            System.out.println(a);
//        }
//
//        //c
//        for (int b = 20; b < 41; b = b + 2){
//            System.out.println(b);
//        }
//
//        //d
//        for (int i = 0; i < 5; i++){
//            System.out.println("Daria");
//        }

        //przykład
//        for (int i = 0; ; i++) {
//            System.out.println("Daria");
//            if(i == 100){
//                break;
//            }


        //wypisuje wartości parzyste
//        for (int i = 20; i < 41; ++i) {
//            if (i % 2 == 1) {
//                continue;
//            }
//        System.out.println(i);
//    }

        //przykład z prezentcji
//        boolean myFlag = true;
//        int iter = 0;
//        while (myFlag) {
//            System.out.print(iter++);
//            if (iter == 5) myFlag = false;
//            System.out.print("x");
//        }

        //Zadanie 19
//        boolean passwordIncorrect = true;
//        Scanner scanner = new Scanner(System.in);
//        String haslo = "Poprawne hasło 1";
//        while (passwordIncorrect) {
//            System.out.println("Podaj hasło: ");
//            String input = scanner.nextLine();
//            if (haslo.equals(input)) {
//                passwordIncorrect = false;
//            }
//        }
//        System.out.println("Tajny komunikat wyświetla się");

        // Rozwiązanie 19 z do while
//        boolean passwordCorrect = false;
//        Scanner scanner = new Scanner(System.in);
//        String haslo = "Poprawne hasło 1";
//        do {
//            System.out.println("Podaj hasło: ");
//            String input = scanner.nextLine();
//            if (haslo.equals(input)) {
//                passwordCorrect = true;
//            }
//        } while(!passwordCorrect);
//        System.out.println("Tajny komunikat wyświetla się");


//        int[] myFirstArray = new int[5];
//        for (int i = 0; i< 5 ; i++);
//        System.out.println();

        //działanie tabic
//        int[] myFirstArray = new int[5];
//        System.out.println(myFirstArray[0]);
//        System.out.println(myFirstArray[1]);
//        System.out.println(myFirstArray[2]);
//        System.out.println(myFirstArray[3]);
//        System.out.println(myFirstArray[4]);
//
//        myFirstArray[0] = 54;
//        System.out.println(myFirstArray[0]);

        //przykład
//        int[] mySecondArray = new int[] {1,2,3,4,5,10,100,500};
//        for (int i = 0; i < mySecondArray.length; i++) {
//            System.out.println(mySecondArray[i]);
//        }

        //Zadanie 20
//        int[] mySecondArray = new int[]{1, 2, 3, -4, 5000, 10, 100, 500};
//        int max = mySecondArray[0];
//        int min = mySecondArray[0];
//        for (int i = 0; i < mySecondArray.length; i++) {
//            if (mySecondArray[i] > max) {
//                max = mySecondArray[i];
//            }
//            if (mySecondArray[i] < min) {
//                min = mySecondArray[i];
//            }
//        }
//        System.out.println("max: " + max);
//        System.out.println("min: " + min);


        //pętla foreach
        //Zadanie 21
//        Scanner scanner = new Scanner(System.in);
//        int[] mySecondArray = new int[]{1, 2, 3, -4, 5000, 10, 100,3, 500};
//        boolean numberFound = false;
//        System.out.println("Podaj liczbe: ");
//        int input = scanner.nextInt();
//        for(int el : mySecondArray){
//            if(el == input){
//                numberFound = true;
//                break;
//
//            }
//        }
//        System.out.println("liczba znajduje sie w tablicy: " + numberFound);




//
//        Apple apple = new Apple();
//        apple.size = 10;
//
//        System.out.println(apple.size);
//        System.out.println(apple.colour);
//
//        Apple apple1 = new Apple();
//        System.out.println(apple1.size);
//        System.out.println(apple1.colour);





    }

}




//
//    int age = 8;
//if (age > 0 && age < 18)
//        System.out.println("nieletni");
//        else if (age >= 18 && age < 65)
//        System.out.println("pełnoletni");
//        else if (age >= 65)
//        System.out.println("senior");
//        else
//        System.out.println("incorrect age");
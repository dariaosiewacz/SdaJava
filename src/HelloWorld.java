public class HelloWorld {
    public static void main(String[] args) {

        int age = 20;
        System.out.println("Wiek to: " + age);

        boolean isValid = true;
        System.out.println(isValid);
        isValid = false;
        System.out.print(isValid + "\n");

        short myShort;
        myShort = 100;
        System.out.println(myShort);

        double myDouble = 5.543131554;
        System.out.println(myDouble);

        char myChar = 'd';
        System.out.println(myChar);

        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println(sum);

        int c = 6;
        int d = 2;
        int divide = c / d;
        System.out.println(divide);

        float e = 100;
        float f = 200;
        float division = e / f;
        System.out.println(division);

//przykłady string//

        String firstName = "Daria";
        int length = firstName.length();
        System.out.println("Imie ma długość: " + firstName.length());
        System.out.println("String jest pusty: " + firstName.isEmpty());
        System.out.println("String jest pusty: " + (firstName.length() == 0));

        String myString = "This String is String!";
        String substring = " is String";

        System.out.println(myString.indexOf(substring));
        System.out.println("This String is String!".indexOf(" is String"));



        String myString3 = "This String is String!";
        String myString2 = new String ("This String is String!");

        //WAŻNE//

        System.out.println(myString.equals(myString2));

//        System.out.println(myString.concat(5));
//        System.out.println(myString + 5 );










    }

}

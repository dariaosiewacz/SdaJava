public class PowtorkaZad12 {
    public static void main(String[] args) {

        String myString = "Powtórka z zadania numer 12";
        System.out.println(myString);

        //a
        System.out.println(myString.toUpperCase());

        //b
        int lenght = myString.length();
        System.out.println("Liczba znaków w zdaniu to: " + lenght);

        //c
        char OnePlace = myString.charAt(0);
        System.out.println("Znak pierwszy: " + OnePlace);
        char FivePlace = myString.charAt(4);
        System.out.println("Znak piąty: " + FivePlace);

        //d
        myString = myString.toUpperCase();
        //System.out.println(myString);

        //e
        String str = "nie";
        System.out.println(myString.contains(str));

        //f
        String Fragment = myString.substring(4 , 13); //órka z za (znak 13 jest na indeksie 12, ale ta funkcja odejmuje
        //1 więc trzeba wskazać 13
        System.out.println("Fragment tekstu od znaku 5 do 13: " + Fragment);

        //g
        String FragmentTwo = myString.substring(6);
        System.out.println("Fragment tekstu od znaku 7 do końca: " + FragmentTwo);

        //h
        String LastChar = myString.substring(lenght -1);
        System.out.println("Ostatni znak w zdaniu to: " + LastChar);

        //i
        myString = myString + "\n";
        System.out.println(myString.repeat(10));

    }
}

public class ZmiennaString {
    public static void main(String[] args) {

    //Zadanie 12

        String myString = "Przykład zdania do nauki programowania";
        System.out.println(myString);

        //a
        System.out.println(myString.toUpperCase());

        //b
        int length = myString.length();
        System.out.println("Liczba symboli w zdaniu: " + length);

        //c
        char firstChar = myString.charAt(0);
        char fiveChar = myString.charAt(4);
        System.out.println("Miejsce pierwsze: " + firstChar);
        System.out.println("Miejsce piąte: " + fiveChar);

        //d
        myString = myString.toUpperCase();

        //e
        String str = "nie";
        boolean contain = myString.contains(str);
        System.out.println(contain);
        //lub
        //System.out.println(myString.contains(str));
        //System.out.println(myString.contains("nie"));

        //e wersja 2 - wyszukuje bez względu na wielkość liter
        String str2 = "zdA";
        boolean contain2 = myString.toLowerCase().contains(str2.toLowerCase());
        System.out.println("e wersja 2: " + contain2);


        //f
        String fragment = myString.substring(4 , 13);//kład zdan
        System.out.println("Fragment tekstu od znaku 5 do 13: " + fragment);

        //g
        String charFromSevenToEnd = myString.substring(6);
        System.out.println("Fragment tekstu od znaku 7 do końca: " + charFromSevenToEnd);

        //h
        char lastChar = myString.charAt(length - 1);
        System.out.println("Ostatnia litera zdania: " + lastChar);

        //i
        myString = myString + "\n";
        System.out.println(myString.repeat(10));


    }
}

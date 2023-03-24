public class Calculator {
    public static void main(String[] args) {

    //Zadanie 4//

        System.out.println("Będę liczyć");

        int a = 20;
        int b = 5;
        int c = 12;
        int sum = a + b + c;
        System.out.println("wynik to:" + sum);

        sum = sum + a;
        System.out.println("Wynik z dodania wartości a:" + sum);

        sum = sum * b;
        System.out.println("Wynik z mnożenia:" + sum);

        sum = -sum;
        System.out.println("Zmiana znaku na przeciwny:" + sum);

        int pom = a;//20
        a = b;
        b = pom;
        System.out.println(a);
        System.out.println(b);




        int myInt = 103;
        int myInt2 = 104;

//jest to warunek logiczny, warunek logiczny zawsze zwraca true albo false. Znak '==' operator porówania. Sprawdza
        //czy wartości są te same. Dot. to tylko zmiennych typów złożonych. A złożone porónuje 'equals'
        System.out.println(myInt == myInt2 && myInt > 0);
        System.out.println(    (myInt == myInt2) && (myInt > 0)    );

//        int sum = myInt + myInt2;

        sum += myInt;

//        System.out.println(myInt != myInt2);
//        System.out.println(myInt > myInt2);

//        System.out.println(myInt % 5);
//
//        myInt = myInt + 1;
//        myInt ++;
//        System.out.println(myInt);
//
//        myInt--;
//        System.out.println(myInt);



    }
}


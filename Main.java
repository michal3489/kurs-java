import java.util.Scanner;

public class lekcja1 {
    public static void main(String[] args){
               
            int poraRoku = 1;
            switch (poraRoku){
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
                default:
                    System.out.println("Żyjesz na innej planecie");
                    break;
    int a = 25;
        int b = 10;
        double wynik = (double)a / b;
        int wynik2 = a % b;
        int wynik3 = 2 + 2 * 2;
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        a = a + b;
        a += b;
        Math.pow(2, 3);
        final double sqrt = Math.sqrt(256);
        System.out.println(Math.pow(2, 5));
        System.out.println(sqrt);
         int a = 5, b = 6;
        boolean logiczna = a == b;
        boolean logiczn2a = a >= b;
        boolean logiczna3 = a < b && b > a;
        boolean logiczna4 = a < b || b > a;
        System.out.println(logiczna);
        System.out.println(logiczn2a);
        System.out.println(logiczna3);
        System.out.println(logiczna4);

/*
        // dodanie zmiennej char
        char firstName;
        firstName = 'b';
        System.out.println(firstName);
        // string jest obiektem
        String firstString = "Bartek";
        System.out.println(firstString);
        // Boolean
        boolean zmBoolean = false;
        boolean zmBoolean2 = true;
        System.out.println(zmBoolean);
        System.out.println(zmBoolean2);
        // byte jest strukturą
        byte zmByte = Byte.MIN_VALUE;
        byte zmbyte2 = Byte.MAX_VALUE;
        System.out.println("minimum byte " + zmByte + " - " + zmbyte2);
        // short
        short zmShort = Short.MAX_VALUE;
        short zmShort2 = Short.MIN_VALUE;
        System.out.println("minimum short " + zmShort + " - " + zmShort2);
        // Integer
        int zmInt = Integer.MAX_VALUE;
        int zmInt2 = Integer.MIN_VALUE;
        System.out.println("minimum Integer " + zmInt + " - " + zmInt2);
        // long
        long zmLong = Long.MAX_VALUE;
        long zmLong2 = Long.MIN_VALUE;
        System.out.println("minimum long " + zmLong + " - " + zmLong2);
        // float
        float zmFloat = Float.MAX_VALUE;
        float zmFloat2 = Float.MIN_VALUE;
        System.out.println("minimum Float " + zmFloat + " - " + zmFloat2);
        // double
        double zmDouble = Double.MAX_EXPONENT;
        double zmDouble2 = Double.MIN_VALUE;
        System.out.println("minimum double " + zmDouble + " - " + zmDouble2);
        // stałe
        int liczba = 256;
            liczba = zmByte;
  

*/
    }
}

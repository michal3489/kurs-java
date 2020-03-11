import java.util.Scanner;

public class lekcja1 {
    public static void main(String[] args){
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



    }
}

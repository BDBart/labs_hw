package h3;

public class NumericSize {
    public static void main(String[] args) {
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Range van byte is: " + (byteMax - byteMin) + " en zit tussen: " + byteMin + " en " + byteMax);
        System.out.println("Range van short is " + (shortMax - shortMin) +  " en zit tussen: " + shortMin + " en " + shortMax);
        System.out.println("Range van int is :"  + (intMax - intMin) +  " en zit tussen: " + intMin + " en " + intMax);
        System.out.println("Range van long is : " + (longMax - longMin) + "en zit tussen: " + longMin + " en " + longMax);

        //vanwege de notatie van E (exponentie) kan de range niet in een duidelijke numerieke waarde meegegeven worden
        System.out.println("Range van float kan niet meegegeven worden, maar zit tussen: " + floatMin + " en " + floatMax);
        System.out.println("Range van double kan niet meegegeven worden, maar zit tussen: " + doubleMin + " en " + doubleMax);

    }

}

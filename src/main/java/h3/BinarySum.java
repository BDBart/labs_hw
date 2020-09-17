package h3;

public class BinarySum {
    public static void main(String[] args) {
        /*
        Hier gaan we de binary berekening van 1010 + 100 uitvoeren
         */

        byte b1 = 0b1010; //door 0b eerst te noteren maken we er een 'binary literal' van
        byte b2 = 0b0100;
        byte b3 = (byte) (b1 + b2); //het resultaat is zonder een typecasting een int (door het plusje)
        //dus we typecasten het eerst naar een byte

        //bij het printen converteren we b3 naar een binary literal in String vorm om de daadwerkelijke binaire som te krijgen
        System.out.println("b3: " + Integer.toBinaryString(b3));
    }
}

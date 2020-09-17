package h3;

public class ExplainOutcome {
    public static void main(String[] args){
        /*
         * De uitkomst van j uitleggen
         * */

        int i = 3;

        //j krijgt een waarde aangewezen door middel van een ternary operator ook wel bekend als een inline conditional
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println("j: " + j);

        //aangezien i 3 is zal de ternary operator altijd 'false' uitkomen.
        //Hierdoor zal het tweede deel van de operator uitgevoerd worden.

        //Bij dit deel is de expression i++ en dat wordt dus 4.
        //Daarna volgt er een shift. Een shift is een opschuiving van bits
        //de bitwise representatie voor 4 is 0100 en omdat die eenmaal naar rechts wordt geschoven is het dus 0010
        //0010 is gelijk aan 2
    }
}

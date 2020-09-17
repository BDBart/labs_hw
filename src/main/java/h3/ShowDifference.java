package h3;

public class ShowDifference {
    public static void main(String[] args){
        /*
         * Het verschil tussen i++ en ++i
         * */

        int i = 3; //initalisatie
        int j = i++; //expression
        System.out.println("i: " + i); //i is 4 want er is in de expression hierboven bij i opgeteld
        System.out.println("j: " + j); //j is 3 want hij neemt de waarde van i voor het optellen over

        //vergeet niet i is nu 4
        int k = ++i;
        System.out.println("i: " + i); //hier is het 5 want in de expression wordt er wederom opgeteld
        System.out.println("k: " + k); //hier is het ook 5 want in de expression wordt er eerst opgeteld en daarna aangewezen aan k
    }
}

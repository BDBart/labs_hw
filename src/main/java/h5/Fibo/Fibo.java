package h5.Fibo;

/**
 * Een normale Fibonacci reeks begint altijd met een 0 en een 1
 * Dus bij de eerste berekening is het 0 + 1
 * Het resultaat van de berekening verplaatst zich naar de plek van het eerste nummer
 * en het eerste nummer schuift op naar de tweede nummer
 * Hierdoor is de tweede berekening 1 + 0
 *
 * run(int n) en run(int start, int n)
 * n staat voor het aantal berekeningen die de methode moet uitvoeren
 * start staat voor het getal waar de berekening moet starten dus 0 en [start]
 *
 *
 */

public class Fibo {
    //fibonacci reeks begint met een 0 en een 1
    int firstNumber = 0;
    int secondNumber = 1;
    int result; //het resultaat wat uit de som komt in de reeks

    public void run (int n) {
        //zolang i kleiner is dan n (die is meegegeven) steeds de fibonacci berekening uitvoeren
        for (int i = 0; i < n; i++){
            result = firstNumber + secondNumber;
            //System.out.println("fibonacci iteration: " + (i + 1) + ". With result: " + result);
            secondNumber = firstNumber;
            firstNumber = result;
            //System.out.println("End of iteration");
        }
        //System.out.println("Loop has ended");
    }

    public void run(int start, int n){
        secondNumber = start;
        for (int j = 0; j < n; j++){
            result = firstNumber + secondNumber;
            System.out.println("fibonacci iteration: " + (j + 1) + ". With result: " + result);
            secondNumber = firstNumber;
            firstNumber = result;
            System.out.println("End of iteration");
        }
        System.out.println("Loop has ended");
    }

    public int getResult(){
        return result;
    }
}

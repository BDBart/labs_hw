package h4.Hourglass;

import java.util.Scanner;

/**
 * We gaan een hourglass figuur maken door middel van tek...UHUM
 * We gaan Exceptions eindelijk begrijpen door een try/catch clausule
 */
public class Main {
    static int moduloResult = 0;
    static int evenNumber = 2;
    static boolean succesful = false;
    static String path;

    public static void main(String[] args) {
        while (!succesful) {
            try {
                //probeer een hourglass te tekenen met het meegegeven nummer
                getInput();
                succesful = true;

            } catch (EvenNumberException e) {
                //wanneer het met meegegeven nummer niet lukt om te tekenen
                //wordt die hier afgevangen
                System.out.println("Voer even een oneven nummer in joh!");
            }
        }
    }

    static void getInput() throws EvenNumberException{
        System.out.println("Voer een nummer in");
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        if (numberInput % evenNumber != moduloResult){
            System.out.println("Je hebt een oneven nummer ingevoerd!");
        } else {
            throw new EvenNumberException();
        }
    }
}

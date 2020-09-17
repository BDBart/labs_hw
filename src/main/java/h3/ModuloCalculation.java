package h3;

public class ModuloCalculation {
    public static void main(String[] args) {
        /*
        Hier gaan we kijken welke tijd opkomt wanneer er 80 uur is verstreken vanaf 23:00
        en hoeveel dagen er zijn verstreken
         */

        //Welke tijd het is na 80 uur verstreken
        int hoursInADay = 24; //24 uren op een dag
        int elapseTime = 80; //de tijd die gaat verstrijken
        int newTime = (elapseTime % hoursInADay) - 1; //min 1 want het begint vanaf 23:00
        System.out.println("nieuwe tijd: " + newTime + " uur");

        //hoeveel dagen er zijn verstreken
        int currentTime = 23; //huidige tijd
        int daysElapsed = 0; //hoeveel dagen er zijn verstreken
        for (int i = 0; i < elapseTime; i++) {
            //voor elke iteratie gaat er een uur bijkomen op currenttime
            currentTime++;

            //dan kijk je of de dag is voldaan
            if (currentTime == hoursInADay) {

                //zet je de tijd weer op 0 om een nieuwe dag aan uren op te tellen
                currentTime = 0;

                //voeg je een dag toe
                daysElapsed++;
            }
        }

        System.out.println("aantal verstreken dagen is: " + daysElapsed);
    }
}

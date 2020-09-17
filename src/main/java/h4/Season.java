package h4;

public class Season {
    public static void main(String[] args) {
        //SEASONS is een enum [opsomming] die onder deze class is gedefinieerd
        SEASONS currentSeason = SEASONS.FALL; //toekennen van de FALL constante

        //Hier wordt in geval van welk seizoen een tekst geprint
        switch (currentSeason){
            case SPRING:
            case SUMMER:
                System.out.println("These seasons are warm!");
                break;
            case FALL:
            case WINTER:
                System.out.println("These seasons are cold!");
                break;
            case DRY:
            case WET:
                System.out.println("unknown");
                break;
            default: break;
        }
    }
}

enum SEASONS {
    SPRING, SUMMER, FALL, WINTER, DRY, WET
}

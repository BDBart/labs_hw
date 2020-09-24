package h10.inheritance;

public class Android extends Human implements Chargeable{
    private int chargeLevel = 0;
    private static final int MAX_CHARGE = 100;

    @Override
    public String greet(){
        return "I'm only half human, but human still... My energy level is " + chargeLevel + "%";
    }

    @Override
    public int charge(int amount) {
        if ((chargeLevel += amount) <= MAX_CHARGE) return chargeLevel;
        else return 0;
    }
}

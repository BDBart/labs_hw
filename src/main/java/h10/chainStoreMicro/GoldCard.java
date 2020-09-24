package h10.chainStoreMicro;

public class GoldCard extends Card {
    private int discount;

    public GoldCard(int id, String name, float credit){
        super(id, name, credit);
    }

    @Override
    boolean payed(int amount) {
        return false;
    }
}

package h10.chainStoreMicro;

public class RegularCard extends Card {

    public RegularCard(int id, String name, float credit){
        super(id, name, credit);
    }

    @Override
    boolean payed(int amount) {
        return false;
    }
}

package h10.chainStoreMicro;

public abstract class Card {
    protected int id;
    protected String name;
    protected float credit;

    public Card(int id, String name, float credit){
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    abstract boolean payed(int amount);
}

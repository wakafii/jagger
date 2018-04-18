public abstract class Un extends Exp {

    protected Exp op;

    public Un(Exp op) {
        this.op = op;
    }

    public Exp op() {
        return op;
    }

}

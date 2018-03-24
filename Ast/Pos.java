public class Pos extends Num {

    public Pos(int op) {
        super(op);
    }

    public String accept(Visitor v) {
        return v.visit(this);
    }

}

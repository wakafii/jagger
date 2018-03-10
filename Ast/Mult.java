
public class Mult extends Bin {

    public Mult(Exp op1, Exp op2) {
        super(op1, op2);
    }

    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

}

public class Sub extends Bin {

    public Sub(Exp op1, Exp op2) {
        super(op1, op2);
    }

    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

}
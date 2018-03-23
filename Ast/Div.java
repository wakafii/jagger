

public class Div extends Bin {

	public Div(Exp op1, Exp op2) {
		super(op1, op2);
	}

	public String accept(Visitor v) {
		return v.visit(this);
	}

}
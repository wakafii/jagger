

public class Add extends Bin {

	public Add(Exp op1, Exp op2) {
		super(op1, op2);
	}

	public String accept(Visitor v) {
		return v.visit(this);
	}
	
	public int value()
	{
		return this.op1().value() + this.op2().value();
	}

}

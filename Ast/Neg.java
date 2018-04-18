public class Neg extends Un {

    public Neg(Exp op) {
        super(op);
    }

    public String accept(Visitor v) {
        return v.visit(this);
    }
		
		public int value()
		{
			return (-1) * this.op().value();
		}
}

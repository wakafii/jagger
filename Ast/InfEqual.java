public class InfEqual extends Comp {

    public InfEqual(Exp op1, Exp op2) {
        super(op1, op2);
    }

    public String accept(Visitor v) {
        return v.visit(this);
    }

		public int value()
		{
			if(this.op1().value() <= this.op2.value())
			{
				return 1;
			}
			return 0;
		}

}

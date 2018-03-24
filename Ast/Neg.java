public class Neg extends Exp {

		protected Exp op;
    public Neg(Exp op) {
        this.op = op;
    }

		public Exp op()
		{
				return this.op;
		}

    public String accept(Visitor v) {
        return v.visit(this);
    }
}

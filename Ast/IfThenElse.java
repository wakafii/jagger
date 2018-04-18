public class IfThenElse extends Exp
{
		private Exp c;
		private Exp e1;
		private Exp e2;
		
		public IfThenElse(Exp c, Exp e1, Exp e2)
		{
			this.c = c;
			this.e1 = e1;
			this.e2 = e2;
		}

		public Exp opComp()
		{
			return this.c;
		}
	
		public Exp op1()
		{
			return this.e1;
		}

		public Exp op2()
		{
			return this.e2;
		}

		public String accept(Visitor v)
		{
			return v.visit(this);
		}

		public int value()
		{
			if(c.value() == 1)
			{
				return e1.value();
			}
			return e2.value();
		}
}

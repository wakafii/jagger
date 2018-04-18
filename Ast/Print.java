public class Print extends Exp
{
		private Exp e;
		
		public Print(Exp e)
		{
			this.e = e;
		}

		public Exp op()
		{
			return this.e;
		}

		public String accept(Visitor v)
		{
			return v.visit(this);
		}

		public int value()
		{
			return e.value();
		}
}

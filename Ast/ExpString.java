public class ExpString extends Exp {

	private String i;

	public ExpString(String i) {
		this.i = i;
	}

	public int value() {
		return 0;
	}

	public String op()
	{
		return i;
	}

	public String accept(Visitor v)
	{
		return v.visit(this);
	}
	
}

public class Num extends Exp {

	private int i;

	public Num(int i) {
		this.i = i;
	}

	public int value() {
		return i;
	}

	public String accept(Visitor v)
	{
		return v.visit(this);
	}
	
}

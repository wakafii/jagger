public class Var extends Exp {

	private Exp i;
	private String name;

	public Var(String name ,Exp i) {
		this.i = i;
		this.name = name.substring(4,name.length());
	}

	public int value() {
		return i.value();
	}

	public String name()
	{
		return this.name;
	}

	public String accept(Visitor v)
	{
		return v.visit(this);
	}
	
}

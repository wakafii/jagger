import java.util.Vector;
public class LetInEnd extends Exp {

	private Vector<Var> var;
	private Vector<Exp> exp;

	public LetInEnd(Vector<Var> v, Vector<Exp> e) {
		var = v;
		exp = e;
	}

	public int value() {
		return 0;
	}

	public void pushVar(Var v)
	{
		var.add(v);
	}

	public void pushExp(Exp e)
	{
		exp.add(e);
	}

	public int varSize()
	{
		return var.size();
	}

	public int expSize()
	{
		return exp.size();
	}

	public Var getVar(int i)
	{
		return var.get(i);
	}

	public Exp getExp(int i)
	{
		return exp.get(i);
	}

	public String accept(Visitor v)
	{
		return v.visit(this);
	}
	
}

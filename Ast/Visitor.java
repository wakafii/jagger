

public abstract class Visitor{

  public abstract String visit(Num c);
	public abstract String visit(Neg c);
  public abstract String visit(Div d);
  public abstract String visit(Add a);
  public abstract String visit(Mult m);
  public abstract String visit(Sub s);
}

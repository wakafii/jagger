

public abstract class Visitor{

  public abstract String visit(Num c);
	public abstract String visit(Neg c);
  public abstract String visit(Div d);
  public abstract String visit(Add a);
  public abstract String visit(Mult m);
  public abstract String visit(Sub s);
	public abstract String visit(Inf i);
  public abstract String visit(Sup s);
  public abstract String visit(Equal e);
	public abstract String visit(InfEqual ie);
	public abstract String visit(SupEqual se);
	public abstract String visit(Print p);
	public abstract String visit(IfThenElse ite);
	public abstract String visit(ExpString es);
	public abstract String visit(Var v);
	public abstract String visit(LetInEnd lie);
}



public abstract class Visitor<T>{

  public abstract T visit(Num c);
  public abstract T visit(Div d);
  public abstract T visit(Add a);
  public abstract T visit(Mult m);
  public abstract T visit(Sub s);
  
  //public abstract Contexte contexte();
}

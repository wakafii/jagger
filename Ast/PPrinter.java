
/**
 * Décrivez votre classe PPrinter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PPrinter extends Visitor
{

    Exp e;
    /**
     * Constructeur d'objets de classe PPrinter
     */
    public PPrinter(Exp e)
    {
        this.e = e;
    }
    
    public String visit(Num c)
    {
        return Integer.toString(c.value());
    }
		public String visit(Neg c)
    {
        return "-"+c.op().accept(this);
    }
    public String visit(Div d)
    {
        return "(" + d.op1().accept(this) + "/" + d.op2().accept(this) + ")";
    }
    public String visit(Add a)
    {
        return "(" + a.op1().accept(this) + "+" + a.op2().accept(this) + ")";
    }
    public String visit(Mult m)
    {
        return "(" + m.op1().accept(this) + "*" + m.op2().accept(this) + ")";
    }
    public String visit(Sub s)
    {
        return "(" + s.op1().accept(this) + "-" + s.op2().accept(this) + ")";
    }
		public String toString()
		{
			return e.accept(this);
		}

}

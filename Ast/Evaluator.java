
/**
 * Décrivez votre classe PPrinter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Evaluator extends Visitor
{

    private Exp e;
    /**
     * Constructeur d'objets de classe PPrinter
     */
    public Evaluator(Exp e)
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
        return Integer.toString(d.value());
    }
    public String visit(Add a)
    {
        return Integer.toString(a.value());
    }
    public String visit(Mult m)
    {
        return Integer.toString(m.value());
    }
    public String visit(Sub s)
    {
        return Integer.toString(s.value());
    }
		public String visit(Inf i)
    {
        return Integer.toString(i.value());
    }
		public String visit(Sup s)
    {
        return Integer.toString(s.value());
    }
		public String visit(Equal e)
    {
        return Integer.toString(e.value());
    }
		public String visit(InfEqual ie)
    {
        return Integer.toString(ie.value());
    }
		public String visit(SupEqual se)
    {
        return Integer.toString(se.value());
    }

		public String visit(Print p)
		{
				return "=>" + Integer.toString(p.op().value());
		}

		public String visit(IfThenElse ite)
		{
				return Integer.toString(ite.value());
		}

		public String toString()
		{
			return e.accept(this);
		}

}

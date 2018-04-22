
/**
 * Décrivez votre classe PPrinter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PPrinter extends Visitor
{

    private Exp e;
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
		public String visit(Inf i)
    {
				return "(" + i.op1().accept(this) + "<" + i.op2().accept(this) + ")";
    }
		public String visit(Sup s)
    {
				return "(" + s.op1().accept(this) + ">" + s.op2().accept(this) + ")";
    }
		public String visit(Equal e)
    {
				return "(" + e.op1().accept(this) + "==" + e.op2().accept(this) + ")";
    }
		public String visit(InfEqual ie)
    {
				return "(" + ie.op1().accept(this) + "<=" + ie.op2().accept(this) + ")";
    }
		public String visit(SupEqual se)
    {
				return "(" + se.op1().accept(this) + ">=" + se.op2().accept(this) + ")";
    }

		public String visit(Print p)
		{
				return "print(" + p.op().accept(this) + ")";
		}

		public String visit(IfThenElse ite)
		{
			return "If " + ite.opComp().accept(this) + " then\n " + ite.op1().accept(this) + "\nelse\n " + ite.op2().accept(this);
		}

		public String visit(ExpString es)
		{
			return es.op();
		}

		public String visit(Var v)
		{
			return v.name();
		}

		public String visit(LetInEnd lie)
		{
			String res = "Let\n";
			for(int i=0;i<lie.varSize();i++)
			{
				Var v = lie.getVar(i);
				res += v.name() + " := " + Integer.toString(v.value()) + "\n";
			}
			res += "In\n";
			for(int i=0;i<lie.expSize();i++)
			{
				Exp e = lie.getExp(i);
				res += e.accept(this) + "\n";
			}
			res += "End";
			return res;
		}

		public String toString()
		{
			return e.accept(this);
		}

}

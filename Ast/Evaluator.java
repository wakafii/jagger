
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
				if((a.op1() instanceof ExpString) && (a.op2() instanceof ExpString))
				{
					String str1 = a.op1().accept(this);
					str1 = str1.substring(0,str1.length()-1);
					String str2 = a.op2().accept(this);
					str2 = str2.substring(1,str2.length());
					return str1 + str2;
				}
				else
				{        
					return Integer.toString(a.value());
				}
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
				if(i.op1() instanceof ExpString && i.op2() instanceof ExpString)
				{
					int res = i.op1().accept(this).compareTo(i.op2().accept(this));
					if(res < 0)
					{
						return "1";
					}
					else
					{
						return "0";
					}
				}
				else
				{
	        return Integer.toString(i.value());
				}
    }
		public String visit(Sup s)
    {
				if(s.op1() instanceof ExpString && s.op2() instanceof ExpString)
				{
					int res = s.op1().accept(this).compareTo(s.op2().accept(this));
					if(res > 0)
					{
						return "1";
					}
					else
					{
						return "0";
					}
				}
				else
				{
	        return Integer.toString(s.value());
				}
    }
		public String visit(Equal e)
    {
				if(e.op1() instanceof ExpString && e.op2() instanceof ExpString)
				{
					if(e.op1().accept(this).equals(e.op2().accept(this)))
					{
						return "1";
					}
					else
					{
						return "0";
					}
				}
				else
				{
        	return Integer.toString(e.value());
				}
    }
		public String visit(InfEqual ie)
    {
				if(ie.op1() instanceof ExpString && ie.op2() instanceof ExpString)
				{
					int res = ie.op1().accept(this).compareTo(ie.op2().accept(this));
					if(res <= 0)
					{
						return "1";
					}
					else
					{
						return "0";
					}
				}
				else
				{
  	      return Integer.toString(ie.value());
				}
    }
		public String visit(SupEqual se)
    {
				if(se.op1() instanceof ExpString && se.op2() instanceof ExpString)
				{
					int res = se.op1().accept(this).compareTo(se.op2().accept(this));
					if(res >= 0)
					{
						return "1";
					}
					else
					{
						return "0";
					}
				}
				else
				{
	        return Integer.toString(se.value());
				}
    }

		public String visit(Print p)
		{
				return "=>" + Integer.toString(p.op().value());
		}

		public String visit(IfThenElse ite)
		{
				return Integer.toString(ite.value());
		}

		public String visit(ExpString es)
		{
			return es.op();
		}

		public String toString()
		{
			return e.accept(this);
		}

}

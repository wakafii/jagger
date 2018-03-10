
/**
 * Décrivez votre classe PPrinter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PPrinter<T> extends Visitor<T>
{

    /**
     * Constructeur d'objets de classe PPrinter
     */
    public PPrinter()
    {
    }
    
    public T visit(Num c)
    {
        return null;
    }
    public T visit(Div d)
    {
        return null;
    }
    public T visit(Add a)
    {
        //print lhs, +, rhs
        
        return null;
    }
    public T visit(Mult m)
    {
        return null;
    }
    public T visit(Sub s)
    {
        return null;
    }

}

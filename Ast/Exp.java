  

/**
 * Une expression arithm�tique
 */
public abstract class Exp {

    public abstract <T> T accept(Visitor<T> v);

}
  

/**
 * Une expression arithm�tique
 */
public abstract class Exp {

    public abstract String accept(Visitor v);
		public abstract int value();

}

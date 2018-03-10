public class Num extends Exp {

	private int i;

	public Num(int i) {
		this.i = i;
	}

	public int value() {
		return i;
	}

	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}
	
}
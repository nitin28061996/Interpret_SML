
public class VarExp extends Expr {
	

	public final String s;
	public VarExp(String s) {
		//super();
		this.s = s;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		return e.lookup(s);
	}
	@Override
	public String toString() {
		
		return s;
	}

}

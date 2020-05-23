
public class BoolConst extends Expr {
	

	boolean b;
	
	public BoolConst(boolean b) {
		
		this.b = b;
	}

	public Value eval(Env e) throws EvalError {
		return new BoolVal(b);
	}

	public String toString() {
	
		String s1=String.valueOf(b);return s1;
	}

}

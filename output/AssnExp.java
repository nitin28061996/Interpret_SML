
public class AssnExp extends Expr{
	public String s;
	public Expr ex;
	public AssnExp(String s, Expr ex) {
		this.s = s;
		this.ex = ex;
	}
	
	
	public Value eval(Env e) throws EvalError {
		return ex.eval(e.addBinding(s, ex.eval(e)));
	}
	
	public String toString() {
		
		return s+":="+ex.toString();
	}
	

}

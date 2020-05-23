
public class LetValExp extends Expr{
	public LetValExp(String s, Expr ex1, Expr ex2) {
		super();
		this.s = s;
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	String s;
	Expr ex1,ex2;
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		
		
		return ex2.eval(e.addBinding(s, ex1.eval(e)));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "let val"+s+":="+ex1.toString()+"in"+ex2.toString()+"end";
	}

}

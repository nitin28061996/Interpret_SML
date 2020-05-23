
public class WhileExp extends Expr{
	Expr ex1,ex2;
	boolean b1;
	
	public WhileExp(Expr ex1, Expr ex2) {
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		
		
		BoolVal bv=new BoolVal(false);
		b1=((BoolVal)ex1.eval(e)).b;
		
		if(ex1.eval(e).getClass()== BoolVal.class)
		{
			if(b1)
			{
				ex2.eval(e);
			}
		}
		return bv;
	}
	@Override
	public String toString() {
	
		return "while "+ex1.toString()+"do "+ex2.toString();
	}


}

public class IfExp extends Expr {
	Expr ex1,ex2,ex3;
	BoolVal bv;
	
	public IfExp(Expr ex1, Expr ex2, Expr ex3) {
		super();
		this.ex1 = ex1;
		this.ex2 = ex2;
		this.ex3 = ex3;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		
		 bv=new BoolVal(false);
		
		if(ex1.eval(e).getClass()==BoolVal.class){
			if(!((BoolVal)ex1.eval(e)).b){
				return ex3.eval(e);
			}else{
				return ex2.eval(e);
			}
				
		}
		else{
		return bv;
		}
	}
	@Override
	public String toString() {
		
		return "if "+ex1.toString()+"then "+ex2.toString()+"else "+ex3.toString();
	}

}

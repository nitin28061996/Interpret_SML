
public class LetFunExp extends Expr{
	public String s1,s2;
	public Expr ex1,ex2;
	public IntVal iv;
	

	public LetFunExp(String s1, String s2, Expr ex1, Expr ex2) {
	
		this.s1 = s1;
		this.s2 = s2;
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		
		iv=new IntVal(0);
		Env env1=e.addBinding(s1, iv);
		FunVal fv=new FunVal(env1,s2,ex1);
		env1.updateBinding(s1, fv);
		Value v= ex2.eval(env1);
		return v;
	}

	@Override
	public String toString() {
		
		String str= "let fun"+s1+"("+s2+")"+ex1.toString()
		+"in"+ex2.toString()+"end";
		return str;
	}

}

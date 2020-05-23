
public class FunVal extends Value{
	Env env;
	String s;
	Expr ex;
	public FunVal(Env env, String s, Expr ex) {
		super();
		this.env = env;
		this.s = s;
		this.ex = ex;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
	

}

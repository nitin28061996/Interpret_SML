/*public class AppExp extends Expr{
	String s;
	Expr ex1;
	Env env;
	FunVal fv;
	public AppExp(String s, Expr ex1) {
		super();
		this.s = s;
		this.ex1 = ex1;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		if(e.lookup(s).getClass()==FunVal.class){
			fv=(FunVal)e.lookup(s);
			env=fv.env.addBinding(fv.s, ex1.eval(e));
			return fv.ex.eval(env);
		}
		else throw new EvalError("Argument Error");
	}
	@Override
	public String toString() {	
		return s+"("+ex1.toString()+")";	
	}
}*/

public class AppExp extends Expr {
	String str;
	Expr expr1;
	public AppExp(String str, Expr expr1) {
		super();
		this.str = str;
		this.expr1 = expr1;
	}
	@Override
	public Value eval(Env e) throws EvalError {
		// TODO Auto-generated method stub
		Value value=e.lookup(str);
		//System.out.prfunintln(value);
		if (value instanceof FunVal )
		{   //Value val=new FunVal(str2,expr1,env1);
			Value v1=expr1.eval(e);
			FunVal funval=(FunVal)value; 
			//System.out.println(v1.toString());
			Env env1=funval.env.addBinding(funval.s,v1);
			return  funval.ex.eval(env1);
		}
		else throw new EvalError("Error: incompatiable argument"); 

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str+"("+expr1.toString()+")";
	}



}


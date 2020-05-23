
public class BinExp extends Expr{
	public BinOp bo;
	public Expr ex1,ex2;
	public IntVal iv;
	public BoolVal bv;
	public boolean b;

	
	public BinExp(BinOp bo, Expr ex1, Expr ex2) {
		this.bo = bo;
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	public Value eval(Env e) throws EvalError {
		int n1=((IntVal)ex1.eval(e)).value;
		int n2=((IntVal)ex2.eval(e)).value;
		
		
		iv=evaluate(bo,n1,n2);
		bv=evaluate2(bo,n1,n2,ex1.eval(e),ex2.eval(e));
		if(iv!=null)return iv;
		else return bv;
		
		
	}
	public IntVal evaluate(BinOp bo, int n1, int n2) throws EvalError {
		// TODO Auto-generated method stub
		
		if(bo.equals(BinOp.ADD))
		switch(bo){
		case ADD:return new IntVal(n1+n2);
		
		case SUB:return new IntVal(n1-n2);
		case MUL:return new IntVal(n1*n2);
		case DIV:
				if(n2==0)throw new EvalError("Division not possible as the denominator is 0");
				else return new IntVal(n1/n2);
		
		
	}
		return null;

}

	public BoolVal evaluate2(BinOp bo, int n1, int n2, Value eval, Value eval2) {
		// TODO Auto-generated method stub
		switch(bo){
		case EQUAL: if(eval.getClass()==IntVal.class && eval2.getClass()==IntVal.class){
			if(n1==n2)b=true;
			return new BoolVal(b);
		}else if(eval.getClass()==BoolVal.class && eval2.getClass()==BoolVal.class){
			boolean x=((BoolVal)eval).b;
			boolean y=((BoolVal)eval2).b;
			if(x==y)return new BoolVal(true);
			
		}
		case LT:return new BoolVal(n1<n2);
		case AND:boolean x1=((BoolVal)eval).b;
		boolean y1=((BoolVal)eval2).b;
		if(x1)return new BoolVal(y1);
		else return new BoolVal(false);
		
		case OR:boolean x2=((BoolVal)eval).b;
		boolean y2=((BoolVal)eval2).b;
		if(x2)return new BoolVal(true);
		else return new BoolVal(y2);
		
		
		}
		return null;
	
	}
	public String toString()
	
	{
		
		switch(bo){
		
		case ADD:return ex1.toString()+"+"+ex2.toString();
		case SUB:return ex1.toString()+"-"+ex2.toString();
		case MUL:return ex1.toString()+"*"+ex2.toString();
		case DIV:return ex1.toString()+"/"+ex2.toString();
		case EQUAL:return ex1.toString()+"="+ex2.toString();
		case AND:return ex1.toString()+"&"+ex2.toString();
		case OR:return ex1.toString()+"|"+ex2.toString();
		case LT:return ex1.toString()+"<"+ex2.toString();
		default:
			return "No operator found";
			
		
		}
		
		
			
		
		
		
			
		
			
			
		
			
			
		
		
			
	}
	

}



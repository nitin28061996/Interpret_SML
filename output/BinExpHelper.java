
public class BinExpHelper {

	public BinExpHelper() {
		// TODO Auto-generated constructor stub
	}
	public boolean b;


	public IntVal evaluate(BinOp bo, int n1, int n2) throws EvalError {
		// TODO Auto-generated method stub
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

	

}

	





public class SeqExp extends Expr{
	public Expr ex1,ex2;

	public SeqExp(Expr ex1, Expr ex2) {
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	@Override
	public Value eval(Env e) throws EvalError {
		ex1.eval(e);
		Value v=ex2.eval(e);
		return v;
	}

	@Override
	public String toString() {
		return "{"+ex1.toString()+";"+ex2.toString()+"}";

	}

}

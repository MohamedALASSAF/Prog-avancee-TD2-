package fr.dauphine.javaavance.td2;

public class Value implements Expr {
	
	private double v ;
	
	public Value(double v) {
		this.v = v ;
	}
	
	public Value(Expr v) {
		this.v = v.eval() ;
	}

	@Override
	public double eval() {
		return v;
	}
	
}

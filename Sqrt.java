package fr.dauphine.javaavance.td2;

public class Sqrt implements Expr {
	private double v ;
	
	@Override
	public double eval() {
		return v;
	}
	
	public Sqrt(Expr expr) {
		this.v = Math.sqrt(expr.eval()) ;
	}
	
	@Override
	public String toString() {
		return "\u221a" + v ;
	}

}

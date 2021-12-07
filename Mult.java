package fr.dauphine.javaavance.td2;

public class Mult implements Expr {
	
	private double v ;
	private double expr1; 
	private double expr2; 

	public Mult(Expr expr1, Expr expr2) {
		v = expr1.eval() * expr2.eval() ;
		this.expr1 = expr1.eval() ;
		this.expr2 = expr2.eval() ;
	}
	
	@Override
	public double eval() {
		return v;
	}
	
	@Override
	public String toString() {
		return expr1 + " * " + expr2 +" = " + v ;
	}

}

package math_expression;

public class Test34 {
	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;
	
	public void compute() {
		sideA = 3;
		sideB = 4;
		sideC = ;
		perimeterTriangle = sideA + sideB + sideC;
		radius = 5;
		perimeterCircle = ;
	}
	
	private External external;	
	
	public Test34(External external){
		this.external = external;
	}
	
	interface External {		
	public int pow («arg»,«arg);
	public int sqrt («arg);
	public int pi ();
	}
}

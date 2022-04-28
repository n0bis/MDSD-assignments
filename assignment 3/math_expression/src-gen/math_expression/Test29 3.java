package math_expression;

public class Test29 {
	public int x;
	public int y;
	
	public void compute() {
		x = this.external.pow( 4,   2 );
		y = x - 2;
	}
	
	private External external;
	  
	public Test29(External external) {
		this.external = external;
	}
	interface External {
		int pow(int n, int m);
	}
}

package math_expression;

public class Test30 {
	public int x;
	
	public void compute() {
		x = this.external.sqrt( this.external.pow( this.external.pi(),   2 ) );
	}
	
	private External external;
	  
	public Test30(External external) {
		this.external = external;
	}
	interface External {
		int pow(int n, int m);
		int sqrt(int n);
		int pi();
	}
}

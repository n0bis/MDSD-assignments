package math_expression;

public class Test27 {
	public int x;
	public int y;
	
	public void compute() {
		x = this.external.pi();
		y = x + 2;
	}
	
	private External external;	
	
	public Test27(External external){
		this.external = external;
	}
	
	interface External {		
	public int pi ();
	}
}

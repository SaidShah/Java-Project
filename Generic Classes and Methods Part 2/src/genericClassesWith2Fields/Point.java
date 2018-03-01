package genericClassesWith2Fields;

public class Point <T,S>{

	private T x; // as long as you use different place holers you can use as many data types as you  want
	private S y;
	public Point(T x, S y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public S getY() {
		return y;
	}
	public void setY(S y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
		
}

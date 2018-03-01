package genericClasses;

public class Point <T> {// you can extend the T to implement a certain class just like the generic methods

	private T x;
	private T y;// the capital T means type but its generic but you have to declare T in the header 
				//  so java knows  its only a place holder
	

				public Point(T x, T y) {
					this.x = x;
					this.y = y;
				}


				public T getX() {
					return x;
				}


				public void setX(T x) {
					this.x = x;
				}


				public T getY() {
					return y;
				}


				public void setY(T y) {
					this.y = y;
				}


				@Override
				public String toString() {
					return "Point [x=" + x + ", y=" + y + "]";
				}
	
}

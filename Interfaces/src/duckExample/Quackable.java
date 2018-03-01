package duckExample;

public interface Quackable {
	default void quack(){
		System.out.println("quack");
	}
}

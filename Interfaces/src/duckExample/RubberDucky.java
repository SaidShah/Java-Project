package duckExample;

public class RubberDucky extends Duck implements Quackable {

	public RubberDucky(String name, String id) {
		super(name, id);

	}
	@Override
	public void quack(){
		System.out.println("squeak squeak");
	}

}

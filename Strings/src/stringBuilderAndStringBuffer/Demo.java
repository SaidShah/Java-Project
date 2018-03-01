package stringBuilderAndStringBuffer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder(" Hello ");
		builder.append(" Hi");
		System.out.println(builder);
		builder.insert(2, " hi");
		System.out.println(builder);
		System.out.println(builder.reverse());
	}

}

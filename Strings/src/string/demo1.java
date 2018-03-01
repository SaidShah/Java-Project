package string;

public class demo1 {
	public static void main(String[] args){
String str1 ="hello";
String str2="hello";//interned object
System.out.println(str1==str2);//compares the content of reference variables(address)
System.out.println(str1.equals(str2)); // compare contents of the string objects

String str3 = new String("Hello");// guaranteed new object
System.out.println(str1==str3);

//string objects are immutable
str1 = "hi";

	}
}

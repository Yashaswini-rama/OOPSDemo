
public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("JamesGosling");
		int l=str.length();
		System.out.println("The Length of String is:"+l);
		System.out.println("The Capacity of string is:"+str.capacity());
		
		System.out.println("The substring is:"+str.substring(0,5));
		str.replace(5, 10, "Java");
		System.out.println(str);
		System.out.println("The revesed string is:"+str.reverse());
		
	}

}

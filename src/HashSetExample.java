import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String>hset=new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		//Addition of dupllicate elements
		hset.add("Apple");
		hset.add("Apple");

		//addition of null values
		hset.add("null");
		hset.add("null");
		
		System.out.println(hset);
	}

}

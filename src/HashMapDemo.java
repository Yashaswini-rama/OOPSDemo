import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> languages=new HashMap<>();
		languages.put(1, "Java");
		languages.put(1, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap:"+languages);
		
		String value=languages.get(1);
		System.out.println("Value at index1: "+value);
		System.out.println("Value at index1: "+languages.get(3));
		
		System.out.println("Keys: "+languages.keySet());
		System.out.println("Values: "+languages.values());
		
		System.out.println("key/value mappings: "+languages.entrySet());

		languages.replace(2, "C++");
	}

}

import java.io.*;
public class Depersisit {

	public static void main(String[] args) throws Exception
	{
		ObjectInputStream In=new ObjectInputStream(new FileInputStream("C:/Test/f.txt"));
		Student s=(Student)In.readObject();
		System.out.println(s.id+" "+s.name);
		In.close();

	}

}

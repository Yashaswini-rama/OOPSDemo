import java.io.*;
public class Persist {

	public static void main(String[] args) throws Exception
	{
		Student s1=new Student(1,"Yashaswini");
		
		FileOutputStream fout=new FileOutputStream("C:/Test/f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		
		out.close();

	}

}
